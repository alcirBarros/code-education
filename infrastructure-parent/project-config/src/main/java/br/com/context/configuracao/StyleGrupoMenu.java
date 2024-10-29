package br.com.context.configuracao;

import java.util.ArrayList;
import java.util.List;

public class StyleGrupoMenu {

    private String info;
    private List<StyleMenu> styleMenuList = new ArrayList<>();

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<StyleMenu> getStyleMenuList() {
        return styleMenuList;
    }

    public void setStyleMenuList(List<StyleMenu> styleMenuList) {
        this.styleMenuList = styleMenuList;
    }
}
