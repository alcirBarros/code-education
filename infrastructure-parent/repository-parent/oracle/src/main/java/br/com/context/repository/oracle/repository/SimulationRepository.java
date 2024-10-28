package br.com.context.repository.oracle.repository;


import br.com.context.repository.oracle.model.Simulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulationRepository extends JpaRepository<Simulation, Long>, JpaSpecificationExecutor<Simulation> {


}
