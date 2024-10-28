package br.com.context.service;

import br.com.context.model.Entidade;

public interface ControleTelaService {
    
    public Entidade findByTipoFuncaoEnum(Entidade tipoFuncaoEnum);
    
}
