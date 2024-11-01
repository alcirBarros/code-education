package br.com.restfull.api.controller;

import br.com.context.model.driver.ObjectEntity;
import br.com.service.driver.ObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@RequestMapping(path = "/objecto")
public class ObjectoController {

    @Autowired
    private ObjetoService objetoService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ObjectEntity> upload(@RequestParam("imagemFile") MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String contentType = file.getContentType();
        int length = file.getBytes().length;
        byte[] bytes = file.getBytes();

        ObjectEntity objeto = new ObjectEntity();
        objeto.setFileName(originalFilename);
        objeto.setFileType(contentType);
        objeto.setGetContents(bytes);
        objeto.setSize(length);
        ObjectEntity createObjeto = objetoService.save(objeto);

        return ResponseEntity.ok().body(createObjeto);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<byte[]> download() {
        ObjectEntity imageName = objetoService.findByFileName("imagem.jpeg");
        String fileType = imageName.getFileType();
        MediaType mediaType = MediaType.valueOf(fileType);
        byte[] getContents = imageName.getGetContents();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(mediaType);
        return ResponseEntity.ok().headers(headers).body(getContents);
    }
}
