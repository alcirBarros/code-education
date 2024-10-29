package exposed.com.br.exception

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class ValidationError(
    var statusCode: String,
    var status: String,
    var errorList: List<ErrorObject>
)
