package br.com.repository.contato;

import br.com.context.model.contato.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContactEntity, Integer> {

}
