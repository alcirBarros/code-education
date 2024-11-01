package br.com.restfull.api.controller;

import br.com.context.model.PerfilEntity;

import java.util.List;

import br.com.service.perfil.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PerfilController implements IPerfilController {

    @Autowired
    private PerfilService perfilService;

    @Override
    @RequestMapping(method = {RequestMethod.GET})
    public ResponseEntity<List<PerfilEntity>> findall(@PageableDefault(direction = Sort.Direction.ASC) Pageable pageable) {
        Page<PerfilEntity> operadorIterable = perfilService.findAll(pageable);
        return new ResponseEntity(operadorIterable, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = {RequestMethod.GET})
    public ResponseEntity<PerfilEntity> findById(@PathVariable(value = "id") Integer id) {
        return perfilService.findById(id).map(agenda -> {
            return ResponseEntity.ok().body(agenda);
        }).orElse(ResponseEntity.notFound().build());
    }

    @Override
    @RequestMapping(method = {RequestMethod.DELETE})
    public ResponseEntity<HttpStatus> delete(@RequestParam("id") Integer id) {
        return perfilService.findById(id).map((PerfilEntity record) -> {
            perfilService.deleteById(record.getId());
            return ResponseEntity.ok().body(HttpStatus.OK);
        }).orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(method = {RequestMethod.POST})
    public ResponseEntity<PerfilEntity> create(@RequestBody PerfilEntity perfil) {
        PerfilEntity create = perfilService.save(perfil);
        return new ResponseEntity<>(create, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = {RequestMethod.PUT})
    public ResponseEntity<PerfilEntity> update(@PathVariable(value = "id") Integer id, @RequestBody PerfilEntity perfil) {
        return perfilService.findById(id).map((PerfilEntity record) -> {
            PerfilEntity updated = perfilService.save(perfil);
            return ResponseEntity.ok().body(updated);
        }).orElse(ResponseEntity.notFound().build());
    }

}
