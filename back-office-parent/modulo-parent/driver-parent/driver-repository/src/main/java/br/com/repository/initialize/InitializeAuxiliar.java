package br.com.repository.initialize;

import br.com.context.model.driver.DriverEntity;
import br.com.repository.driver.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;

@Order(1)
@Configuration
@Profile({"dev", "init"})
public class InitializeAuxiliar implements CommandLineRunner {
    
    @Autowired
    private DriverRepository driverRepository;


    @Override
    public void run(String... args) throws Exception {

        DriverEntity driver = new DriverEntity();
        driver.setDescricao("Amazon - AWS");
        driverRepository.save(driver);
       
    }
}
