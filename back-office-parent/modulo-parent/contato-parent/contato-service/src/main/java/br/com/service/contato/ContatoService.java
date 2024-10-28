package br.com.service.contato;

import br.com.context.model.contato.ContactEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.repository.contato.ContatoRepository;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public ContactEntity save(ContactEntity instituicao) {
        return contatoRepository.save(instituicao);
    }

    public List<ContactEntity> findAll() {
        return contatoRepository.findAll();
    }
}
