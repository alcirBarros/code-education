package br.com.modulo.administracao.uploadedfile.service;

import java.io.File;
import java.util.HashMap;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UploadFileService {

    private static HashMap<String, File> hashMap = new HashMap<>();

    public File arquivo(String string) {
        return hashMap.get(string);
    }

    public void arquivo(String string, File file) {
        hashMap.put(string, file);
    }

}
