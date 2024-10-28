package br.com.context;

import graphql.schema.GraphQLSchema;
import graphql.schema.idl.SchemaPrinter;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GraphqldemoApplicationTests {


//    @Autowired
//    private GraphQlTester graphQlTester;

//    @Autowired
//    GraphQLSchema graphQLSchema;
//
//    @Autowired
//    MockMvc mockMvc;

//    @Test
//    void listFoods() throws Exception {
//
//        printSchema(graphQLSchema);
//
//        String expectedResponse = "{\"data\":{\"foods\":[" +
//                "{\"id\":1,\"name\":\"Pizza\",\"isGood\":true}," +
//                "{\"id\":2,\"name\":\"Spam\",\"isGood\":false}," +
//                "{\"id\":3,\"name\":\"Eggs\",\"isGood\":true}," +
//                "{\"id\":4,\"name\":\"Avocado\",\"isGood\":false}" +
//                "]}}";
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/graphql")
//                .content("{\"query\":\"{ foods { id name isGood } }\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().json(expectedResponse))
//                .andReturn();
//    }

    private void printSchema(GraphQLSchema graphQLSchema) {
        SchemaPrinter schemaPrinter = new SchemaPrinter();
        String printer = schemaPrinter.print(graphQLSchema);
        System.out.println(printer);
    }


//    @Test
//    void listFoods() {
//
//        String query = "{ allEmployees { name } }";
//
//        graphQlTester.qquery("")
//                .execute()
//                .path("allEmployees[*].name")
//                .entityList(String.class)
//                .containsExactly("", "", "");
//    }

}