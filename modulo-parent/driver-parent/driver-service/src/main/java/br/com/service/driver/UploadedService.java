package br.com.service.driver;


import br.com.context.model.driver.UploadedEntity;
import br.com.repository.driver.UploadedRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadedService {

    @Autowired
    private UploadedRepository uploadedRepository;

    public UploadedEntity save(UploadedEntity uploaded) {
        return uploadedRepository.save(uploaded);
    }

    public List<UploadedEntity> findAll() {
        return uploadedRepository.findAll();
    }
}
