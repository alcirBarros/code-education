package br.com.template.exception;

//import br.com.projeto.exception.BusinessException;
import br.com.template.scoped.ConfigurableBeanFactory;
import javax.faces.application.ViewExpiredException;
//import javax.persistence.OptimisticLockException;
import java.io.Serializable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by rmpestano on 07/01/17.
 */
@Controller
@Scope(ConfigurableBeanFactory.SCOPE_VIEW)
public class ExceptionMB implements Serializable {

    public void throwBusinessException() {
    //    throw new BusinessException("This kind of exception generates a faces message with severity <code>error</code>.");
    }

//    public void multipleBusinessException() {
//        throw new BusinessException().
//                addException(new BusinessException("Exception 1")).
//                addException(new BusinessException("Exception 2")).
//                addException(new BusinessException("Exception 3"));
//    }

    public void throwPointerException() {
        throw new NullPointerException("this is a runtime exception...");
    }

    public void throwRuntime() {
        throw new RuntimeException("this is a runtime exception...");
    }

    public void throwAccessDenied() {
        throw new AccessDeniedException("this is an access denied exception...");
    }

    public void throwViewExpired() {
        throw new ViewExpiredException("this is a view expired exception...");
    }

    public void throwOptimisticLock() {
//        throw new OptimisticLockException("this is a optimistic lock exception...");
    }
}
