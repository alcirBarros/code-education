package exposed.com.br.exception

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class FieldError(val field: String?, val message: String?)
