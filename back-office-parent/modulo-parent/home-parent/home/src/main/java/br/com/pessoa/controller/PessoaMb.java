package br.com.pessoa.controller;

import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class PessoaMb extends AbstractMb {

}
