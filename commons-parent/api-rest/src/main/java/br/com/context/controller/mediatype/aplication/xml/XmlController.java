package br.com.context.controller.mediatype.aplication.xml;

import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController()
@RequestMapping(value = "/mediatype")
public class XmlController {

  @Value("classpath:filetype/file.xml")
  private Resource FILE_XML;

  @RequestMapping(value = "/application/xml", method = {RequestMethod.GET})
  public ResponseEntity<Resource> downloadFile() throws IOException {
    String fileName = FILE_XML.getFilename();
    InputStream inputStream = FILE_XML.getInputStream();
    byte[] bytes = inputStream.readAllBytes();
    ByteArrayResource resource = new ByteArrayResource(bytes);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_XML);
    headers.setContentDispositionFormData(fileName, fileName);
    headers.setContentLength(bytes.length);
    return ResponseEntity.ok().headers(headers).body(resource);
  }

}
