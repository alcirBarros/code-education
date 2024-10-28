package br.com.context;


import br.com.context.repository.oracle.model.Simulation;
import br.com.context.repository.oracle.repository.PartnerRepository;
import br.com.context.repository.oracle.repository.SimulationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
public class SimulationRepositoryTest {


    @Autowired
    private DataSource dataSource;

    @Autowired
    private SimulationRepository simulationRepository;

    @Autowired
    private PartnerRepository partnerRepository;

    @Test
    public void test01() {
        List<Simulation> all = simulationRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void test02() {
        List all = partnerRepository.findAll();
        System.out.println(all);
    }
}
