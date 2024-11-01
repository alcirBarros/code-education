package br.com.repository.driver;

import br.com.context.model.driver.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverEntity, Integer> {

}
