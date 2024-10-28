package br.com.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindException
import org.springframework.validation.FieldError
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.util.stream.Collectors
import javax.management.InvalidAttributeValueException
import javax.servlet.http.HttpServletResponse

@RestControllerAdvice
class ExceptionHandlerController {

    private fun getError(type: String?, message: String?, field: String?): ErrorObject {
        val errorObject = ErrorObject()
        errorObject.type = type
        errorObject.message = message
        errorObject.field = field
        return errorObject
    }

    private fun getErrors(ex: BindException): List<ErrorObject> {
        return ex.bindingResult.fieldErrors.stream().map { error: FieldError ->
            val code = error.code
            val defaultMessage = error.defaultMessage
            val field = error.field
            getError(code, defaultMessage, field)
        }.collect(Collectors.toList())
    }

    private fun getErrorResponse(ex: BindException): ValidationError {
        val objectName = ex.bindingResult.objectName
        val errorList = getErrors(ex)
        val validationError = ValidationError()
        validationError.timestamp = System.currentTimeMillis()
        validationError.errorList = errorList.toMutableList()
        validationError.objectName = objectName
        return validationError
    }

    @ExceptionHandler(Exception::class)
    fun handleException(ex: Exception): ResponseEntity<ValidationError>? {
        val httpStatus = HttpStatus.BAD_REQUEST
        val errorMessage = ex.toString()

        val errorValidation: ValidationError = ValidationError()
        errorValidation.timestamp = System.currentTimeMillis()
        errorValidation.status = httpStatus

        val errorObject: ErrorObject = getError(null, errorMessage, null)
        errorValidation.addErrorObject(errorObject)

        return ResponseEntity.status(httpStatus).body(errorValidation)
    }

    @ExceptionHandler(BindException::class)
    fun handleValidationExceptions(ex: BindException): ResponseEntity<ValidationError> {
        val httpStatus = HttpStatus.BAD_REQUEST

        val errorResponse: ValidationError = getErrorResponse(ex)
        errorResponse.status = httpStatus

        return ResponseEntity.status(httpStatus).body(errorResponse)
    }

    @ExceptionHandler(InvalidAttributeValueException::class)
    fun handleAccessDeniedException(res: HttpServletResponse): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(null)
    }
}
