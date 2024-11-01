package br.com.context.repository.auxiliar.tipoturno;

import br.com.context.model.tipoturno.enumerator.TipoTurnoEnum;
import br.com.context.model.tipoturno.model.TipoTurno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTurnoRepository extends JpaRepository<TipoTurno, Integer> {
    
    public TipoTurno findByCodigo(String codigo);
    
    public TipoTurno findByTipoTurnoEnum(TipoTurnoEnum tipoTurnoEnum);
    
}
