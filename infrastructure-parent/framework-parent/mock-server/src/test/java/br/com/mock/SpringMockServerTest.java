package br.com.mock;


import br.com.mock.model.EmployeeResponse;
import br.com.mock.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.matchers.MatchType;
import org.mockserver.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.mockserver.model.JsonBody.json;
import static org.mockserver.model.Parameter.param;
import static org.mockserver.model.StringBody.exact;


@SpringBootTest
public class SpringMockServerTest {

    @Autowired
    private EmployeeService employeeService;

    private ClientAndServer clientAndServer = new ClientAndServer(1080);

    @Test
    public void defaultJobParameters() {


        JsonBody jsonBody = json("{\"id\":1}", MatchType.ONLY_MATCHING_FIELDS);
        StringBody stringBody = exact("{\"username\": \"foo\", \"password\": \"bar\"}");

        EmployeeResponse employee = new EmployeeResponse("E001", "Eric Simmons");
        JsonBody employeeJsonBody = json(employee);

        HttpRequest post = request();
        post.withMethod("GET");
        post.withPath("/employee/E001");
        post.withHeader("\"Content-type\", \"application/json\"");
        post.withQueryStringParameters(param("cartId", "055CA455-1DF7-45BB-8535-4F83E7266092"));
        //post.withBody(stringBody);
        //post.exactly(1);

        HttpResponse httpResponse = response();
        httpResponse.withStatusCode(HttpStatus.OK.value());
        //httpResponse.withContentType(MediaType.APPLICATION_JSON);
        httpResponse.withHeader(new Header("Content-Type", "application/json; charset=utf-8"));
        httpResponse.withHeader(new Header("Cache-Control", "public, max-age=86400"));

        httpResponse.withBody(employeeJsonBody);
        httpResponse.withDelay(TimeUnit.SECONDS, 1);


        new MockServerClient("127.0.0.1", 1080).when(post).respond(httpResponse);


        ResponseEntity<EmployeeResponse> responseEntityEmployee = employeeService.getEmployee("E001");

        EmployeeResponse body = responseEntityEmployee.getBody();
        assertEquals(employee, body);
    }


}
