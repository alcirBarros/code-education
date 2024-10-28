package br.com.context;

//import com.oktadeveloper.annotations.GraphQLController;
//import com.oktadeveloper.autoconfigure.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties(Properties.class)
public class ApplicationSpringBoot {

//	@Autowired
//	private ConfigurableApplicationContext context;
//
//	@Autowired
//	Properties properties;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSpringBoot.class, args);
	}

//	@Bean
//	//@ConditionalOnProperty(name = "graphql.spqr.relay.spring-data-compatible", havingValue = "true")
//	public void teste() {
//		Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(GraphQLController.class);
//		for (String beanName : beansWithAnnotation.keySet()) {
//			Class<?> operationSourceBeanClass = beansWithAnnotation.get(beanName).getClass();
//
//			System.out.println(beansWithAnnotation);
//		}
//	}



//	@Bean
//	ApplicationRunner init(PessoaController pessoaController) {
//		return args -> {
//			Stream.of("Gustavo", "Marcelo", "Gabriel", "Guilherme").forEach(name -> {
//				Pessoa pessoa = new Pessoa();
//				pessoa.setName(name);
//				pessoaController.save(pessoa);
//			});
//			pessoaController.findAll().forEach(System.out::println);
//		};
//	}

}
