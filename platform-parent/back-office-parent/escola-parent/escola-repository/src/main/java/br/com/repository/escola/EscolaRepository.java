package br.com.repository.escola;

import br.com.context.model.SchoolEntity;
import br.com.context.model.MunicipioEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepository extends JpaRepository<SchoolEntity, Integer> {
    
    public List<SchoolEntity> findByMunicipio(MunicipioEntity municipio);

}
