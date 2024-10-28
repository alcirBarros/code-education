package br.com.context.exception;


import com.fasterxml.jackson.annotation.JsonInclude;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(NON_NULL)
class ValidationError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private HttpStatus status;
    private String objectName;

    private List<ErrorObject> errorList = new ArrayList<>();

    public ValidationError() {
    }

    public ValidationError(Long timestamp, HttpStatus status) {
        super();
        this.timestamp = timestamp;
        this.status = status;
    }

    public void addErrorObject(ErrorObject errorObject) {
        errorList.add(errorObject);
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public List<ErrorObject> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<ErrorObject> errorList) {
        this.errorList = errorList;
    }


}
