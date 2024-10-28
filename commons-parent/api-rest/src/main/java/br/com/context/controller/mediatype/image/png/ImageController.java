package br.com.context.controller.mediatype.image.png;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Validated
@RestController()
@RequestMapping(value = "/mediatype")
public class ImageController {

  @Value("classpath:filetype/image.jpg")
  private Resource FILE_XML;

  @PostMapping("/image/jpeg")
  public ResponseEntity<List<String>> uploadImage(@RequestParam("image") MultipartFile[] list) throws IOException{
    List<String> collect = Arrays.asList(list)
        .stream()
        .map(MultipartFile::getOriginalFilename)
        .collect(Collectors.toList());
    return ResponseEntity.status(HttpStatus.OK).body(collect);


  }

  @GetMapping("/image/jpeg")
  public ResponseEntity<byte[]> downloadImage() throws IOException {
    byte[] bytes = FILE_XML.getInputStream().readAllBytes();
    return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.IMAGE_JPEG).body(bytes);
  }

}
