package br.com.context.controller.mediatype.application.xml;

import java.io.IOException;
import java.io.InputStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Slf4j
@RestController
@Scope(value = "singleton")
@RequestMapping("/mediatype")
public class ApplicationXmlController {


    @Value("classpath:filetype/file.xml")
    private Resource FILE_XML;

    private boolean result = Boolean.TRUE;

    @ResponseBody
    @GetMapping(value = "/application/xml/01")
    public ResponseEntity<Mono<Resource>> get01() throws IOException {
        //        String fileName = String.format("%s.csv", RandomStringUtils.randomAlphabetic(10));
        String fileName = FILE_XML.getFilename();
        InputStream inputStream = FILE_XML.getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        ByteArrayResource resource = new ByteArrayResource(bytes);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);
        headers.setContentDispositionFormData(fileName, fileName);
        headers.setContentLength(bytes.length);

        Mono<Resource> monoResource = Mono.just(resource);
        return ResponseEntity.ok().headers(headers).body(monoResource);
    }

//    @PostMapping("/application/xml/02")
//    public Mono<String> upload(@RequestPart("file") FilePart filePart, ServerHttpRequest httpRequest) throws Exception {
//        String fileName = System.nanoTime() + "-" + filePart.filename();
//        return Mono.<Boolean>fromCallable(() -> {
//                return BlockingUtils.createFile(filePart, uploadDir, fileName);
//            }).subscribeOn(Schedulers.boundedElastic()).<String>flatMap(createFileState -> {
//                Object resp = false;
//                if(createFileState){
//                    String baseUrl = BlockingUtils.baseUrl(httpRequest);
//                    resp = baseUrl +"/file/download/"+ fileName;
//                }
//                return Mono.just(resp.toString());
//            });
//    }

    @GetMapping(value = "/application/xml/02")
    public Mono<ResponseEntity<Resource>> get02() {
        String fileName = FILE_XML.getFilename();
        return Mono.<Resource>fromCallable(() -> {
            InputStream inputStream = FILE_XML.getInputStream();
            byte[] bytes = inputStream.readAllBytes();
            return new ByteArrayResource(bytes);
        }).subscribeOn(Schedulers.boundedElastic()).flatMap(resource -> {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_XML);
            headers.setContentDispositionFormData(fileName, fileName);
            return Mono.just(ResponseEntity.ok().cacheControl(CacheControl.noCache()).headers(headers).body(resource));
        });
    }

}
