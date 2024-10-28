package br.com.context.configuracao;

import java.util.List;

public interface Configuracao {

    public TipoProjetoEnum getTipoProjetoEnum();

    public String getTitulo();

    public String getVersao();
    
    public List<GrupoMenu> getGrupoMenuList();

}
