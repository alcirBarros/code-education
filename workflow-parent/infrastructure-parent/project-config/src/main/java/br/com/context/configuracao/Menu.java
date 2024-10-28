package br.com.context.configuracao;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String titulo;
    private String link;
    private List<StyleMenu> styleMenuList = new ArrayList<>();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<StyleMenu> getStyleMenuList() {
        return styleMenuList;
    }

    public void setStyleMenuList(List<StyleMenu> styleMenuList) {
        this.styleMenuList = styleMenuList;
    }   
}