package br.com.configuracao;

import br.com.context.configuracao.Configuracao;
import br.com.context.configuracao.ConfiguracaoProjeto;
import br.com.context.configuracao.GrupoMenu;
import br.com.context.configuracao.Menu;
import br.com.context.configuracao.StyleGrupoMenu;
import br.com.context.configuracao.StyleMenu;
import br.com.context.configuracao.SubConfiguracao;
import br.com.context.configuracao.TipoProjetoEnum;
import br.com.context.configuracao.TipoSeparadorMenuEnum;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ConfiguracaoService implements ConfiguracaoProjeto {

    private SubConfiguracao configuracao;

    @PostConstruct
    public void init() {
        System.out.println("br.com.soap.configuracao.soap.ConfiguracaoProdespService.init()");
        configuracao = new SubConfiguracao();
        configuracao.setTipoProjetoEnum(TipoProjetoEnum.WEB);
        configuracao.setTitulo("Pessoa");
        configuracao.setVersao("1.0.00.00");

        {

            GrupoMenu grupoMenu = new GrupoMenu();
            grupoMenu.setMenuTitle("Pessoa");
            grupoMenu.setTipoSeparadorMenuEnum(TipoSeparadorMenuEnum.Menu);

            {
                {
                    StyleMenu styleMenu = new StyleMenu();
                    styleMenu.setStyle("fa");
                    grupoMenu.getStyleMenuList().add(styleMenu);
                }
                {
                    StyleMenu styleMenu = new StyleMenu();
                    styleMenu.setStyle("fa-dashboard");
                    grupoMenu.getStyleMenuList().add(styleMenu);
                }
            }

            {
                {
                    StyleGrupoMenu styleGrupoMenu = new StyleGrupoMenu();
                    styleGrupoMenu.setInfo("12");
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("label");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("pull-right");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("bg-yellow");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    grupoMenu.getStyleGrupoMenuList().add(styleGrupoMenu);
                }
                {
                    StyleGrupoMenu styleGrupoMenu = new StyleGrupoMenu();
                    styleGrupoMenu.setInfo("16");
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("label");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("pull-right");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("bg-green");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    grupoMenu.getStyleGrupoMenuList().add(styleGrupoMenu);
                }
                {
                    StyleGrupoMenu styleGrupoMenu = new StyleGrupoMenu();
                    styleGrupoMenu.setInfo("5");
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("label");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("pull-right");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    {
                        StyleMenu styleMenu = new StyleMenu();
                        styleMenu.setStyle("bg-red");
                        styleGrupoMenu.getStyleMenuList().add(styleMenu);
                    }
                    grupoMenu.getStyleGrupoMenuList().add(styleGrupoMenu);
                }
            }

            {

                Menu menu = new Menu();
                menu.setTitulo("Cadastro");
                menu.setLink("/pages/private/pessoa/pessoa.xhtml");

                {
                    StyleMenu styleMenu = new StyleMenu();
                    styleMenu.setStyle("fa");
                    menu.getStyleMenuList().add(styleMenu);
                }
                {
                    StyleMenu styleMenu = new StyleMenu();
                    styleMenu.setStyle("fa-circle-o");
                    menu.getStyleMenuList().add(styleMenu);
                }

                grupoMenu.getMenuList().add(menu);
            }
            configuracao.getGrupoMenuList().add(grupoMenu);
        }

    }

    @Override
    public Configuracao getConfiguracao() {
        return configuracao;
    }
}
