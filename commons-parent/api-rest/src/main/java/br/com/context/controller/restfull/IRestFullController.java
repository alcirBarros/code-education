package br.com.context.controller.restfull;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Tag(name = "Recurso")
public interface IRestFullController {

    @Operation(summary = "Get", description = "Método utilizado para recuperar uma lista de operadores")
    ResponseEntity<String> get();

    @Operation(summary = "Delete", description = "Método utilizado para excluir operador")
    ResponseEntity<HttpStatus> delete();
}





