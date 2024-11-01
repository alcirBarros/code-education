package br.com.restfull.api.controller;

import br.com.context.model.Role;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Tag(name = "Role")
public interface IRoleController {

    @PreAuthorize("hasAuthority('ADMIN')")
    @Operation(summary = "Lista operador", description = "Método utilizado para recuperar uma lista de operadores")
    ResponseEntity<List<Role>> findAll(Pageable pageable);

    @Operation(summary = "Excluir operador", description = "Método utilizado para excluir operador")
    ResponseEntity<HttpStatus> delete(@RequestParam("id") Integer id);
}





