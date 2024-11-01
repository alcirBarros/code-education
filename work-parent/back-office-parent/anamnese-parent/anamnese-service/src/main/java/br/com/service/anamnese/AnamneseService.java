package br.com.service.anamnese;

import br.com.context.model.pessoa.AnamneseEntity;
import br.com.repository.anamnese.AnamneseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnamneseService {

    @Autowired
    private AnamneseRepository anamneseRepository;

    public AnamneseEntity save(AnamneseEntity anamneseEntity) {
        return anamneseRepository.save(anamneseEntity);
    }

    public List<AnamneseEntity> findAll() {
        return anamneseRepository.findAll();
    }
}
