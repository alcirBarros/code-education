package br.com.context.controller;

import br.com.context.config.amazon.s3.s3bucket.BucketObject;
import br.com.context.service.S3Service;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class BucketController {

    @Autowired
    private S3Service s3Services;

    @GetMapping("/bucket")
    public List<BucketObject> bucket() {
        log.info("BucketController.bucket");
        return s3Services.findAll();
    }
}
