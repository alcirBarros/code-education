package br.com.restfull.api.controller;

import br.com.context.model.Role;
import br.com.service.modulo.administracao.operador.RoleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController implements IRoleController {

    @Autowired
    private RoleService roleService;

    @Override
    @RequestMapping(method = {RequestMethod.GET})
    public ResponseEntity<List<Role>> findAll(@PageableDefault(direction = Sort.Direction.ASC) Pageable pageable) {
        Page<Role> operadorIterable = roleService.findAll(pageable);
        return new ResponseEntity(operadorIterable, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = {RequestMethod.GET})
    public ResponseEntity<Role> read(@PathVariable(value = "id") Integer id) {
        return roleService.findById(id).map(agenda -> {
            return ResponseEntity.ok().body(agenda);
        }).orElse(ResponseEntity.notFound().build());
    }

    @Override
    @RequestMapping(method = {RequestMethod.DELETE})
    public ResponseEntity<HttpStatus> delete(@RequestParam("id") Integer id) {
        return roleService.findById(id).map((Role record) -> {
            roleService.deleteById(record.getId());
            return ResponseEntity.ok().body(HttpStatus.OK);
        }).orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(method = {RequestMethod.POST})
    public ResponseEntity<Role> create(@RequestBody Role role) {
        Role createRole = roleService.save(role);
        return new ResponseEntity<>(createRole, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = {RequestMethod.PUT})
    public ResponseEntity<Role> update(@PathVariable(value = "id") Integer id, @RequestBody Role agenda) {
        return roleService.findById(id).map((Role record) -> {
            Role updated = roleService.save(agenda);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
    }

}
