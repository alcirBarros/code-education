package br.com.context.configuracao;

import java.util.ArrayList;
import java.util.List;

public class GrupoMenu {
    
    private String menuTitle;
    private TipoSeparadorMenuEnum tipoSeparadorMenuEnum = TipoSeparadorMenuEnum.Menu;
    private List<StyleMenu> styleMenuList = new ArrayList<>();
    private List<StyleGrupoMenu> styleGrupoMenuList = new ArrayList<>();
    private List<Menu> menuList = new ArrayList<>();

    public TipoSeparadorMenuEnum getTipoSeparadorMenuEnum() {
        return tipoSeparadorMenuEnum;
    }

    public void setTipoSeparadorMenuEnum(TipoSeparadorMenuEnum tipoSeparadorMenuEnum) {
        this.tipoSeparadorMenuEnum = tipoSeparadorMenuEnum;
    }
    
    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public List<StyleMenu> getStyleMenuList() {
        return styleMenuList;
    }

    public void setStyleMenuList(List<StyleMenu> styleMenuList) {
        this.styleMenuList = styleMenuList;
    }

    public List<StyleGrupoMenu> getStyleGrupoMenuList() {
        return styleGrupoMenuList;
    }

    public void setStyleGrupoMenuList(List<StyleGrupoMenu> styleGrupoMenuList) {
        this.styleGrupoMenuList = styleGrupoMenuList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
    
    
    
}
