package br.com.repository.driver;

import br.com.context.model.driver.UploadedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadedRepository extends JpaRepository<UploadedEntity, Integer> {



}
