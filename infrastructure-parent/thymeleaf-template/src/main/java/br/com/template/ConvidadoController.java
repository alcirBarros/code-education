package br.com.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadoController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("listaConvidados")
    public String listaConvidados() {
        return "listaConvidados";
    }

}
