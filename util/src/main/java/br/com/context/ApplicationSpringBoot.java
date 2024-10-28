package br.com.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringBoot.class, args);
    }

//    org.springframework.cglib.proxy.InvocationHandler handler = new org.springframework.cglib.proxy.InvocationHandler() {
//        @Override
//        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//           System.out.println("interceptando a invocação do metodo " + method.getName());
//            return method.invoke(delegate, args);
//        }
//    };

}


