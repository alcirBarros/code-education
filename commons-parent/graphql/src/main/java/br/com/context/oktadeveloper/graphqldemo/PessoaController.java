package br.com.context.oktadeveloper.graphqldemo;

//import com.oktadeveloper.annotations.GraphQLController;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaPrinter;
//import io.leangen.graphql.annotations.GraphQLArgument;
//import io.leangen.graphql.annotations.GraphQLContext;
//import io.leangen.graphql.annotations.GraphQLMutation;
//import io.leangen.graphql.annotations.GraphQLQuery;
//import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
* Interface de Browser propria para se trabalhar com GraphQl
* http://localhost:8080/gui
* */

@Controller
//@GraphQLApi
//@GraphQLController
public class PessoaController {
//
//
//    @Autowired
//    private GraphQLSchema graphQLSchema;
//
//    @Autowired
//    private GraphQL graphQL;
//
//    @Autowired
//    private PessoaRepository pessoaRepository;
//
//    public PessoaController() {
//    }
//
////    public PessoaController(PessoaRepository pessoaRepository) {
////        this.pessoaRepository = pessoaRepository;
////    }
//
//    @PostConstruct
//    private void init(){
//        printSchema(graphQLSchema);
//    }
//
//    private void printSchema(GraphQLSchema graphQLSchema) {
//        SchemaPrinter schemaPrinter = new SchemaPrinter();
//        String printer = schemaPrinter.print(graphQLSchema);
//        System.out.println(printer);
//    }
//
//    @GraphQLQuery(name = "pessoaFindAll")
//    public List<Pessoa> findAll() {
//        return pessoaRepository.findAll();
//    }
//
//    @GraphQLQuery(name = "pessoaFindById")
//    public Optional<Pessoa> findById(@GraphQLArgument(name = "id") Long id) {
//        return pessoaRepository.findById(id);
//    }
//
//    @GraphQLMutation(name = "pesspaSave")
//    public Pessoa save(@GraphQLArgument(name = "food") Pessoa pessoa) {
//        return pessoaRepository.save(pessoa);
//    }
//
//    @GraphQLMutation(name = "pessoaDelete")
//    public void pessoaDelete(@GraphQLArgument(name = "id") Long id) {
//        pessoaRepository.deleteById(id);
//    }
//
//    @GraphQLQuery(name = "isGood")
//    public boolean isGood(@GraphQLContext Pessoa pessoa) {
//        return !Arrays.asList("Avocado", "Spam").contains(pessoa.getName());
//    }
//
}