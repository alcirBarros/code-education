package br.com.context.controller;

import br.com.context.config.amazon.s3.s3bucket.BucketObject;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class HealthCheckController {

  @GetMapping("/")
  public String healthCheck() {
    log.info("HealthCheckController.bucket");
    return "health-check: OK";
  }
}
