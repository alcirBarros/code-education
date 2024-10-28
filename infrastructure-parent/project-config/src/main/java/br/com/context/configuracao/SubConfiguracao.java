package br.com.context.configuracao;

import java.util.ArrayList;
import java.util.List;

public class SubConfiguracao implements Configuracao {

    private TipoProjetoEnum tipoProjetoEnum;
    private String titulo;
    private String versao;

    private List<GrupoMenu> grupoMenuList = new ArrayList<>();

    @Override
    public TipoProjetoEnum getTipoProjetoEnum() {
        return tipoProjetoEnum;
    }

    public void setTipoProjetoEnum(TipoProjetoEnum tipoProjetoEnum) {
        this.tipoProjetoEnum = tipoProjetoEnum;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public List<GrupoMenu> getGrupoMenuList() {
        return grupoMenuList;
    }

    public void setGrupoMenuList(List<GrupoMenu> grupoMenuList) {
        this.grupoMenuList = grupoMenuList;
    }
}
