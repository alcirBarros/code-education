package br.com.exception

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class ErrorObject {
    var type: String? = null
    var message: String? = null
    var field: String? = null
}
