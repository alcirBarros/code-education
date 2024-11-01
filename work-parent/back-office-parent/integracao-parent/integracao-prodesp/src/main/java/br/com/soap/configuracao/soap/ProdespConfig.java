package br.com.soap.configuracao.soap;

import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class ProdespConfig {

    private AuthorizationServicoExterno authorizationServicoExterno;

    @PostConstruct
    public void init() {
        System.out.println("br.com.soap.configuracao.soap.ProdespConfig.init()");
        authorizationServicoExterno = new AuthorizationServicoExterno();
        authorizationServicoExterno.setUrl("https://homologacaointegracaosed.educacao.sp.gov.br/educacao/Sec.BS.SecretariaMunicipal.cls");
        authorizationServicoExterno.setUsername("SME665");
        authorizationServicoExterno.setPassword("h7r6fu54;eU?");
    }

    public AuthorizationServicoExterno getAuthorizationServicoExterno() {
        return authorizationServicoExterno;
    }
}
