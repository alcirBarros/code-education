package br.com.context.controller.crud;

import br.com.context.dto.StatusRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController()
@RequestMapping(value = "/crud")
public class CrudController {


  @RequestMapping(method = {RequestMethod.GET})
  public ResponseEntity<String> get() {
    return new ResponseEntity("OK", HttpStatus.OK);
  }

  @RequestMapping(method = {RequestMethod.POST})
  public ResponseEntity<StatusRequest> post(@RequestBody @Valid StatusRequest statusRequest) {
    return ResponseEntity.ok().body(statusRequest);
  }

  @RequestMapping(method = {RequestMethod.PUT})
  public ResponseEntity<HttpStatus> put(@RequestParam @NotBlank() @CNPJ String id) {
    return ResponseEntity.ok().body(HttpStatus.OK);
  }

  @RequestMapping(method = {RequestMethod.DELETE}, path = "/{id}")
  public ResponseEntity<HttpStatus> delete(@PathVariable String id) {
    return ResponseEntity.ok().body(HttpStatus.OK);
  }

}
