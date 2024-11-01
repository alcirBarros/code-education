//package br.com.soap.configuracao.soap;
//
//import br.com.projeto.configuracao.ConfiguracaoProjeto;
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ConfiguracaoProdespService implements ConfiguracaoProjeto {
//
//    private List<ConfiguracaoProdesp> ConfiguracaoProdespList = new ArrayList<>();
//
//    @PostConstruct
//    public void init() {
//        System.out.println("br.com.soap.configuracao.soap.ConfiguracaoProdespService.init()");
//        ConfiguracaoProdesp configuracaoProdesp = new ConfiguracaoProdesp();
//        configuracaoProdesp.setProjectEnum(TipoProjetoEnum.PRODESP);
//        configuracaoProdesp.setTitulo("Prodesp");
//        configuracaoProdesp.setVersao("1.0.01.00");
//
//        ConfiguracaoProdespList.add(configuracaoProdesp);
//    }
//
//    @Override
//    public List findAll() {
//        return ConfiguracaoProdespList;
//    }
//
//}
