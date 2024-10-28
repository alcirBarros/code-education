//package br.com.context;
//
//import br.com.context.controller.restfull.RestFullController;
//import org.hamcrest.CoreMatchers;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//
//import static org.hamcrest.Matchers.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(RestFullController.class)
//public class WebLayerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void shouldReturnDefaultMessage() throws Exception {
//
//        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = get("/restfull/")
//                .contentType(MediaType.APPLICATION_JSON);
//
//        this.mockMvc.perform(mockHttpServletRequestBuilder)
//                .andDo(print())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(content().string(CoreMatchers.containsString("OK")))
//                //            .andExpect(jsonPath("$[0].cnpj", is("CNPJ")))
//                .andExpect(jsonPath("cnpj", nullValue()))
//                .andExpect(jsonPath("cnpj", notNullValue()))
//                .andExpect(jsonPath("cnpj", is("value")))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void shouldReturnErrorDefault() throws Exception {
//
//        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = get("/restfull//home/notebook/Desenvolvimento/Projeto/educa-facil/api-rest/src/main/kotlin/br/com/context/validation/localdate/DateValidator.kt")
//                .contentType(MediaType.APPLICATION_JSON);
//
//        this.mockMvc.perform(mockHttpServletRequestBuilder)
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void shouldReturnSuccessDefault() throws Exception {
//
//        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = get("/restfull/methodArgumentBindingResultNotValidException")
//                .contentType(MediaType.APPLICATION_JSON);
//
//        this.mockMvc.perform(mockHttpServletRequestBuilder)
//                .andDo(print())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isBadRequest());
//    }
//
//    @Test
//    void registrationWorksThroughAllLayers() throws Exception {
//
////        doThrow(new NullPointerException()).when(service).findByInstallmentId(any());
//
//        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = get("/restfull/{forumId}", 42L).param("sendWelcomeMail", "true");
//
//        mockMvc.perform(mockHttpServletRequestBuilder).andExpect(status().is4xxClientError());
//
//    }
//}
