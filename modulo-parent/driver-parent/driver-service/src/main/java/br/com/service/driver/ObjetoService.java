package br.com.service.driver;


import br.com.context.model.driver.ObjectEntity;
import br.com.repository.driver.ObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ObjetoService {

    @Autowired
    private ObjetoRepository objetoRepository;

    public ObjectEntity save(ObjectEntity objeto) {
        return objetoRepository.save(objeto);
    }

    public Optional<ObjectEntity> findById(UUID id){
        return objetoRepository.findById(id);
    }

    public List<ObjectEntity> findAll() {
        return objetoRepository.findAll();
    }

    public ObjectEntity findByFileName(String s){
        return objetoRepository.findByFileName(s);
    }
}
