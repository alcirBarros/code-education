package br.com.repository.paciente;

import br.com.domain.paciente.Paciente;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    List<Paciente> findAll();

    @Modifying
    @Transactional
    @Query(value = "insert into paciente.pcn_paciente (pss_id) VALUES (:id)", nativeQuery = true)
    void converter(@Param("id") Integer id);

}
