package br.com;

//import br.com.template.ApplicationSpringBoot;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.annotation.PostConstruct;

@ServletComponentScan
@SpringBootApplication
public class SpringBootApplicationEducaFacilTemplate
   //     extends ApplicationSpringBoot
{

    @PostConstruct
    private void init(){

    }

//    public static void main(String[] args) {
//        ApplicationSpringBoot.main(args);
//    }

}
