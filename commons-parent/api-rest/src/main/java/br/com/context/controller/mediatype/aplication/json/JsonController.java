package br.com.context.controller.mediatype.aplication.json;

import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController()
@RequestMapping(value = "/mediatype")
public class JsonController {
  @RequestMapping(path = "application/json",
      produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
      consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
      method = {RequestMethod.POST})
  public ResponseEntity<String> postRecaptcha(@RequestBody String requestBody) {
    return ResponseEntity.ok().body("requestBody");
  }

}
