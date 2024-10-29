package exposed.com.br.exception

class BindException(val bindingResult: List<FieldError>) : RuntimeException()
