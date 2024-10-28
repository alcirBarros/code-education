package br.com.context.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandlerController {

    @Autowired
    private MessageSource messageSource;

    private ValidationError getErrorResponse(MethodArgumentNotValidException ex) {
        String objectName = ex.getBindingResult().getObjectName();
        List<ErrorObject> errorList = getErrors(ex);
        ValidationError validationError = new ValidationError();
        validationError.setTimestamp(System.currentTimeMillis());
        validationError.setErrorList(errorList);
        validationError.setObjectName(objectName);
        return validationError;
    }

    private List<ErrorObject> getErrors(MethodArgumentNotValidException ex) {
        return ex.getBindingResult().getFieldErrors().stream().map(error -> {
            String defaultMessage = error.getDefaultMessage();
            String field = error.getField();
            return new ErrorObject(defaultMessage, field);
        }).collect(Collectors.toList());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ValidationError> handleCustomException(ConstraintViolationException ex) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        List<ErrorObject> errorList = ex.getConstraintViolations().stream().map(x -> {
            String message = x.getMessage();
            String field = x.getPropertyPath().toString();
            return new ErrorObject(message, field);
        }).collect(Collectors.toList());
        ValidationError errorValidation = new ValidationError(System.currentTimeMillis(), httpStatus);
        errorValidation.setErrorList(errorList);
        return ResponseEntity.status(httpStatus).body(errorValidation);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ValidationError> handleCustomException(CustomException ex) {
        HttpStatus httpStatus = ex.getHttpStatus();
        String errorMessage = ex.getMessage();
        ValidationError errorValidation = new ValidationError(System.currentTimeMillis(), httpStatus);
        ErrorObject errorObject = new ErrorObject(errorMessage, null);
        errorValidation.addErrorObject(errorObject);
        return ResponseEntity.status(httpStatus).body(errorValidation);
    }

    //@ExceptionHandler(AccessDeniedException.class)
    public void handleAccessDeniedException(HttpServletResponse res) throws IOException {
        res.sendError(HttpStatus.FORBIDDEN.value(), "Access denied");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ValidationError> handleException(HttpServletResponse res, Exception ex) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        String errorMessage = ex.toString();
        ValidationError errorValidation = new ValidationError(System.currentTimeMillis(), httpStatus);
        ErrorObject errorObject = new ErrorObject(errorMessage, null);
        errorValidation.addErrorObject(errorObject);
        return ResponseEntity.status(httpStatus).body(errorValidation);
    }

    //  @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationError> handleValidationExceptions(MethodArgumentNotValidException ex) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        ValidationError errorResponse = getErrorResponse(ex);
        errorResponse.setStatus(httpStatus);
        return ResponseEntity.status(httpStatus).body(errorResponse);
    }

}
