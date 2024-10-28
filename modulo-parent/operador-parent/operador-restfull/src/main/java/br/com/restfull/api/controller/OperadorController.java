package br.com.restfull.api.controller;

import br.com.context.model.Operador;
import br.com.service.modulo.administracao.operador.OperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OperadorController implements IOperadorController{

    @Autowired
    private OperadorService operadorService;

    @Override
    @RequestMapping(method = {RequestMethod.GET})
    public ResponseEntity<List<Operador>> findAll(@PageableDefault(direction = Sort.Direction.ASC) Pageable pageable) {
         Page<Operador> operadorIterable = operadorService.findAll(pageable);
        return new ResponseEntity(operadorIterable, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = {RequestMethod.GET})
    public ResponseEntity<Operador> read(@PathVariable(value = "id") Integer id) {
        return operadorService.findById(id).map(agenda -> {
            return ResponseEntity.ok().body(agenda);
        }).orElse(ResponseEntity.notFound().build());
    }
    
    @Override
    @RequestMapping(method = {RequestMethod.DELETE})
    public ResponseEntity<HttpStatus> delete(@RequestParam("id") Integer id) {
        return operadorService.findById(id).map((Operador record) -> {
            operadorService.deleteById(record.getId());
            return ResponseEntity.ok().body(HttpStatus.OK);
        }).orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(method = {RequestMethod.POST})
    public ResponseEntity<Operador> create(@RequestBody Operador operador) {
        Operador create = operadorService.save(operador);
        return new ResponseEntity<>(create, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = {RequestMethod.PUT})
    public ResponseEntity<Operador> update(@PathVariable(value = "id") Integer id, @RequestBody Operador agenda) {
        return operadorService.findById(id).map((Operador record) -> {
                    Operador updated = operadorService.save(agenda);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

}
