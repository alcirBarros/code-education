package br.com.context.config.mapper.config;

import br.com.context.model.Person;
import br.com.context.model.User;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.builder.ConfigurableConditionExpression;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MappingContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

  @Bean
  public ModelMapper modelMapper() {
    ModelMapper modelMapper = new ModelMapper();
    modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

//    modelMapper.addConverter(new Converter<List<User>, List<String>>() {
//      @Override
//      public List<String> convert(MappingContext<List<User>, List<String>> mappingContext) {
//        return mappingContext.getSource().stream().map(User::getUserName).collect(Collectors.toList());
//      }
//    });

    modelMapper.createTypeMap(User.class, Person.class).addMappings(ModelMapperConfig::configure);
    return modelMapper;
  }

  private static void configure(ConfigurableConditionExpression<User, Person> mapper) {
    mapper.map(User::getUserName, Person::setName);
  }
}
