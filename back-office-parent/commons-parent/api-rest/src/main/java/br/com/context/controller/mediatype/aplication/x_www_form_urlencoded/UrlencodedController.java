package br.com.context.controller.mediatype.aplication.x_www_form_urlencoded;

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
public class UrlencodedController {
  @RequestMapping(path = "/x-www-form-urlencoded",
      produces = {MediaType.APPLICATION_JSON_VALUE},
      consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE},
      method = {RequestMethod.POST})
  public ResponseEntity<MultiValueMap> postRecaptcha(@RequestBody MultiValueMap<String, String> requestBody) {
    return ResponseEntity.ok().body(requestBody);
  }

}
