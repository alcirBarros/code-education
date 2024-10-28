package br.com.context;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import br.com.context.dto.StatusRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@WebMvcTest
public class RestFullControllerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    public MockMvc mockMvc;

    @Test
    void contextLoads() throws Exception {
        mockMvc.perform(get("/restfull")).andExpect(status().isOk());
    }

//    @Test
//    void contextLoads2() throws Exception {
//        StatusRequest statusRequest = new StatusRequest();
//        MockHttpServletRequestBuilder post = post("/restfull");
//        post.contentType(APPLICATION_JSON);
//        post.content(objectMapper.writeValueAsBytes(statusRequest));
//        mockMvc.perform(post).andExpect(status().isOk());
//    }



    @Test
    void clock() throws Exception {

//        mockMvc.perform(get("/restfull/clock")).andExpect(status().isOk());
//
//        assertEquals(c.getLocalDate(), resp.getBody().getLocalDate());
//        assertEquals(c.getLocalTime(), resp.getBody().getLocalTime());
//        assertEquals(c.getLocalDateTime(), resp.getBody().getLocalDateTime());
    }



}
