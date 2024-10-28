package exposed.com.br.exception

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class ErrorObject(
    val field: String? = null,
    val message: String? = null
)
