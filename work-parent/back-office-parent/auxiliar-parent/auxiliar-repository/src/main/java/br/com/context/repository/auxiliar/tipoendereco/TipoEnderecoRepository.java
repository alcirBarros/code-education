package br.com.context.repository.auxiliar.tipoendereco;

import br.com.context.model.tipoendereco.enumerator.TipoEnderecoEnum;
import br.com.context.model.tipoendereco.model.TipoEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEnderecoRepository extends JpaRepository<TipoEndereco, Integer> {

    public TipoEndereco findByTipoEnderecoEnum(TipoEnderecoEnum tipoEnderecoEnums);

}
