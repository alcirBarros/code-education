package br.com.exception

import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.http.HttpStatus
import java.io.Serializable

@JsonInclude(JsonInclude.Include.NON_NULL)
class ValidationError : Serializable {
    var timestamp: Long? = null
    var status: HttpStatus? = null
    var objectName: String? = null
    var errorList: MutableList<ErrorObject> = mutableListOf()

    fun addErrorObject(errorObject: ErrorObject) {
        errorList.add(errorObject)
    }
}
