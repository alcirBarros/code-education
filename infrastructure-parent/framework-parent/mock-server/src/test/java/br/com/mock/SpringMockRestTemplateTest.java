package br.com.mock;

import br.com.mock.model.EmployeeRequest;
import br.com.mock.model.EmployeeResponse;
import br.com.mock.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;

@SpringBootTest
public class SpringMockRestTemplateTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private EmployeeService empService;

    @Test
    public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
        EmployeeResponse employee = new EmployeeResponse("E001", "Eric Simmonspppppppppppp");
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Baeldung-Example-Header", "Value-ResponseEntityConstructorAndHeaders");
        HttpStatus httpStatus = HttpStatus.OK;

        ResponseEntity<EmployeeResponse> employeeResponseEntity = restTemplate.getForEntity(anyString(), eq(EmployeeResponse.class));

        ResponseEntity<EmployeeResponse> responseEntity = new ResponseEntity<>(employee, responseHeaders, httpStatus);
        Mockito.when(employeeResponseEntity).thenReturn(responseEntity);

        ResponseEntity<EmployeeResponse> responseEntityEmployee = empService.getEmployee("E001");
        EmployeeResponse body = responseEntityEmployee.getBody();
        assertEquals(employee, body);
    }

    @Test
    public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject2() {

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Baeldung-Example-Header", "Value-ResponseEntityConstructorAndHeaders");

        HttpStatus httpStatus = HttpStatus.OK;
        EmployeeRequest employeeRequest = new EmployeeRequest("Eric Simmonspppppppppppp");

        ResponseEntity<EmployeeResponse> employeeResponseEntity = restTemplate.postForEntity(anyString(), eq(employeeRequest), eq(EmployeeResponse.class));

        EmployeeResponse employee = new EmployeeResponse("E001", "Eric Simmonspppppppppppp");
        ResponseEntity<EmployeeResponse> responseEntity = new ResponseEntity<>(employee, responseHeaders, httpStatus);
        Mockito.when(employeeResponseEntity).thenReturn(responseEntity);

        ResponseEntity<EmployeeResponse> responseEntityEmployee = empService.postEmployee(employeeRequest);
        EmployeeResponse body = responseEntityEmployee.getBody();
        assertEquals(employee, body);
    }
}
