package br.com.mock.service;

import br.com.mock.model.EmployeeRequest;
import br.com.mock.model.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<EmployeeResponse> getEmployee(String id) {
        return restTemplate.getForEntity("http://localhost:1080/employee/" + id, EmployeeResponse.class);
    }

    public ResponseEntity<EmployeeResponse> postEmployee(EmployeeRequest employeeRequest) {
        return restTemplate.postForEntity("http://localhost:1080/employee", employeeRequest, EmployeeResponse.class);
    }
}
