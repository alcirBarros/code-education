package br.com.context.repository.auxiliar.tiporesponsavel;

import br.com.context.model.tipocontato.model.TipoContato;
import br.com.context.model.tiporesponsavel.enumerator.TipoResponsavelEnum;
import br.com.context.model.tiporesponsavel.model.TipoResponsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoResponsavelRepository extends JpaRepository<TipoResponsavel, Integer> {

    public TipoContato findByTipoResponsavelEnum(TipoResponsavelEnum tipoResponsavelEnum);

}
