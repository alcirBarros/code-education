package br.com.template.exception;

//import br.com.projeto.exception.BusinessException;
import br.com.context.security.OperadorLogado;
import static br.com.context.util.Assert.has;
import br.com.context.util.Constants;
import java.io.ByteArrayOutputStream;
//import com.github.adminfaces.template.util.WebXml;
//import org.omnifaces.util.Exceptions;

//import javax.ejb.EJBException;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.el.ELException;
import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

public class CustomExceptionHandler extends ExceptionHandlerWrapper {

    @Autowired(required = false)
    private OperadorLogado operadorLogado;

    private static final Logger logger = Logger.getLogger(CustomExceptionHandler.class.getName());
    private ExceptionHandler wrapped;

    public CustomExceptionHandler(ExceptionHandler exceptionHandler) {
        this.wrapped = exceptionHandler;
    }

    @Override
    public ExceptionHandler getWrapped() {
        return wrapped;
    }

    @Override
    public void handle() throws FacesException {
        FacesContext context = FacesContext.getCurrentInstance();
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, (ServletContext) context.getExternalContext().getContext());
        findErrorMessages(context);
        handleException(context);
        wrapped.handle();
    }

    /**
     * @param context
     * @throws Throwable
     */
    private void handleException(FacesContext context) {
        Iterator<ExceptionQueuedEvent> unhandledExceptionQueuedEvents = getUnhandledExceptionQueuedEvents().iterator();

        if (unhandledExceptionQueuedEvents.hasNext()) {
            Throwable exception = unhandledExceptionQueuedEvents.next().getContext().getException();
            unhandledExceptionQueuedEvents.remove();

            Throwable rootCause = unwrap(exception);
//
//            if (rootCause instanceof BusinessException) {
//                handleBusinessException(context, (BusinessException) rootCause);
//                return;
//            }
//
//            //send user to error page when unexpected exceptions are raised
            goToErrorPage(context, rootCause);
        }

    }

    public static Throwable unwrap(Throwable exception) {
        return unwrap(exception, FacesException.class, ELException.class);
    }

    public static Throwable unwrap(Throwable exception, Class<? extends Throwable>... types) {
        Throwable unwrappedException = exception;

        while (isOneInstanceOf(unwrappedException.getClass(), types) && unwrappedException.getCause() != null) {
            unwrappedException = unwrappedException.getCause();
        }

        return unwrappedException;
    }

    public static boolean isOneInstanceOf(Class<?> cls, Class<?>... classes) {
        for (Class<?> other : classes) {
            if (cls == null ? other == null : other.isAssignableFrom(cls)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param context
     * @param e
     * @throws Throwable
     */
    private void goToErrorPage(FacesContext context, Throwable e) {
        if (e instanceof FileNotFoundException) {
            logger.log(Level.WARNING, "File not found", e);
            throw new FacesException(e);
        }

        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        Map<String, Object> sessionMap = context.getExternalContext().getSessionMap();
        String requestedUri = request.getHeader("Referer");
        sessionMap.put("userAgent", request.getHeader("user-agent"));

        StringBuilder operadorLogadoStringBuilder = new StringBuilder();

        if (operadorLogado != null && operadorLogado.getUser() != null && operadorLogado.getUser().getId() != null) {
            operadorLogadoStringBuilder.append(StringUtils.leftPad(String.valueOf(operadorLogado.getUser().getId()), 10, "0"));
            operadorLogadoStringBuilder.append(" - ");
            operadorLogadoStringBuilder.append(operadorLogado.getUser().getDisplay().toUpperCase());
        } else {
            operadorLogadoStringBuilder.append("Anonimato.");
        }

        sessionMap.put("operadorLogado", operadorLogadoStringBuilder.toString());
        sessionMap.put("requestedUri", requestedUri);

        ByteArrayOutputStream ostr = new ByteArrayOutputStream();
        e.printStackTrace(new PrintWriter(ostr, true));

        LocalDateTime hoje = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dateTimeFormatter = hoje.format(formatador); //08/04/2014

        sessionMap.put("dataHora", dateTimeFormatter);
        sessionMap.put("stacktrace", ostr.toString().trim());
        sessionMap.put("errorMessage", e != null ? e.getMessage() : "");
        sessionMap.put("exceptionType", e != null ? e.getClass().getName() : null);
        String userIp = request.getHeader("x-forwarded-for") != null ? request.getHeader("x-forwarded-for").split(",")[0] : request.getRemoteAddr();
        sessionMap.put("userIp", userIp);

        String errorPage = null;
//        errorPage = findErrorPage(e);
        if (!has(errorPage)) {
            String errorPageParam = context.getExternalContext().getInitParameter(Constants.InitialParams.ERROR_PAGE);
            if (!has(errorPageParam)) {
                errorPage = Constants.DEFAULT_ERROR_PAGE;
            }
        }
        try {
            context.getExternalContext().redirect(context.getExternalContext().getRequestContextPath() + "/" + errorPage);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Could not redirect user to error page: " + context.getExternalContext().getRequestContextPath() + errorPage, ex);
        }
    }

//    /**
//     * Find error page in web.xml
//     *
//     * @param exception
//     * @return
//     */
//    private String findErrorPage(Throwable exception) {
//        if (exception instanceof EJBException && exception.getCause() != null) {
//            exception = exception.getCause();
//        }
//        String errorPage = WebXml.INSTANCE.findErrorPageLocation(exception);
//
//        return errorPage;
//    }
//    /**
//     * @param context
//     * @param e application business exception
//     */
//    private void handleBusinessException(FacesContext context, BusinessException e) {
//        if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
//            throw new FacesException(e);
//        }
//        if (has(e.getExceptionList())) {
//            for (BusinessException be : e.getExceptionList()) {
//                addFacesMessage(be);
//            }
//        } else { //Single exception
//            addFacesMessage(e);
//        }
//        validationFailed(context);
//        context.renderResponse();
//    }

//    private void addFacesMessage(BusinessException be) {
//        FacesMessage facesMessage = new FacesMessage();
//        if (has(be.getSummary())) {
//            facesMessage.setSummary(be.getSummary());
//        }
//        if (has(be.getDetail())) {
//            facesMessage.setDetail(be.getDetail());
//        }
//        if (has(be.getSeverity())) {
//            facesMessage.setSeverity(be.getSeverity());
//        } else {
//            facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
//        }
////      Messages.add(be.getFieldId(), facesMessage);
//        FacesContext.getCurrentInstance().addMessage(be.getFieldId(), facesMessage);
//    }

    /**
     * Set primefaces validationFailled callback param
     */
    private void validationFailed(FacesContext context) {
        Map<Object, Object> callbackParams = (Map<Object, Object>) context.getAttributes().get("CALLBACK_PARAMS");
        if (callbackParams == null) {
            callbackParams = new HashMap<>();
            callbackParams.put("CALLBACK_PARAMS", callbackParams);
        }
        callbackParams.put("validationFailed", true);

    }

    /**
     * If there is any faces message queued add PrimeFaces validation failed
     *
     * @param context
     */
    private void findErrorMessages(FacesContext context) {
        if (context.getMessageList().isEmpty() || context.isValidationFailed()) {
            return;
        }
        for (FacesMessage msg : context.getMessageList()) {
            if (msg.getSeverity().equals(FacesMessage.SEVERITY_ERROR) || msg.getSeverity().equals(FacesMessage.SEVERITY_FATAL)) {
                validationFailed(context);
                break;
            }
        }
    }

}
