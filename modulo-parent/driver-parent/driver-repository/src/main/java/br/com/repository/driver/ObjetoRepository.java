package br.com.repository.driver;

import br.com.context.model.driver.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ObjetoRepository extends JpaRepository<ObjectEntity, UUID> {

    ObjectEntity findByFileName(String s);
}
