package br.com.context.controller.restfull;

import br.com.context.dto.OtpEmailChecks;
import br.com.context.dto.Param;
import br.com.context.dto.StatusRequest;
import br.com.context.exception.CustomException;
import br.com.context.models.project.ProjetoResponse;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.SmartValidator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Properties;

import static org.springframework.http.ResponseEntity.noContent;

@Validated
@RestController()
@RequestMapping(value = "/restfull")
public class RestFullController implements IRestFullController {

    @Autowired
    private SmartValidator validator;

    @Override
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

    @Override
    @RequestMapping(method = {RequestMethod.DELETE})
    public ResponseEntity<HttpStatus> delete() {
        return ResponseEntity.ok().body(HttpStatus.OK);
    }

    @RequestMapping(path = "status", method = {RequestMethod.GET})
    public ResponseEntity<Properties> status() {
        return new ResponseEntity(System.getProperties(), HttpStatus.OK);
    }

    @RequestMapping(path = "currentversion", method = {RequestMethod.GET})
    public ResponseEntity<HttpStatus> currentVersion() {
        return ResponseEntity.ok().body(HttpStatus.OK);
    }

    @RequestMapping(path = "void", method = {RequestMethod.GET})
    public ResponseEntity<Void> contentVoid() {
        return noContent().build();
    }

    @RequestMapping(path = "customexception", method = {RequestMethod.GET})
    public ResponseEntity<HttpStatus> customException() {
        throw new CustomException("Custom Exception Method Test", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(path = "nullpointerexception", method = {RequestMethod.GET})
    public ResponseEntity<HttpStatus> nullpointerexception() {
        throw new NullPointerException();
    }

    @RequestMapping(path = "requestheader", method = {RequestMethod.GET})
    public ResponseEntity<HttpStatus> requestheader(@RequestHeader(value = "User-Agent", required = false) String accept) {
        return new ResponseEntity(accept, HttpStatus.OK);
    }

    @RequestMapping(path = "/project/data/type", method = {RequestMethod.GET})
    public ResponseEntity<ProjetoResponse> projectdatatype() {
        ProjetoResponse projetoResponse = new ProjetoResponse();
        return ResponseEntity.ok().body(projetoResponse);
    }

    @RequestMapping(path = "methodargumentnotvalidexception", method = {RequestMethod.POST})
    public ResponseEntity<String> methodArgumentNotValidException(@RequestBody @Valid StatusRequest statusRequest) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("KEY", "Value");
        return new ResponseEntity<>("Body", httpHeaders, HttpStatus.OK);
    }

    @RequestMapping(path = "methodArgumentBindingResultNotValidException", method = {RequestMethod.POST})
    public ResponseEntity<HttpStatus> methodArgumentBindingResultNotValidException(@RequestBody @Valid StatusRequest dtoStatusRequest, BindingResult bindingResult) throws BindException {
        validator.validate(dtoStatusRequest, bindingResult, OtpEmailChecks.class);
        if (bindingResult.hasErrors()) throw new BindException(bindingResult);
        return new ResponseEntity(dtoStatusRequest, HttpStatus.OK);
    }

    @RequestMapping(path = "recaptcha", consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE}, method = {RequestMethod.POST})
    public ResponseEntity<String> postRecaptcha(@RequestParam MultiValueMap<String,String> param, @RequestBody MultiValueMap<String, String> requestBody) {
        return ResponseEntity.ok().body(param.getFirst("g-recaptcha-response"));
    }

    @RequestMapping(path = "param/{id}", method = {RequestMethod.GET})
    public ResponseEntity<StatusRequest> test(@PathVariable String id, @RequestParam MultiValueMap<String,String> param, @RequestBody StatusRequest statusRequest) {
        return ResponseEntity.ok().body(statusRequest);
    }

}
