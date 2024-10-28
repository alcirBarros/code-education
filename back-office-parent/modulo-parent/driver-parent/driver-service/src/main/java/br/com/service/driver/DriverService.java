package br.com.service.driver;


import br.com.context.model.driver.DriverEntity;
import br.com.repository.driver.DriverRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public DriverEntity save(DriverEntity driver) {
        return driverRepository.save(driver);
    }

    public List<DriverEntity> findAll() {
        return driverRepository.findAll();
    }
}
