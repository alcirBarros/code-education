package br.com.context.controller;

import br.com.context.model.Employee;
import br.com.context.repository.EmployeeRepository;
import java.time.Duration;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;


@RestController
@AllArgsConstructor
@RequestMapping("/employees")
public class Controller {

    private final EmployeeRepository employeeRepository;

    @GetMapping
    private Flux<Employee> findAllEmployees() {
        return employeeRepository.findAllEmployees();
    }


    @GetMapping(value = "/")
    public Flux<Employee> index() {
        return employeeRepository.findAllEmployees();
    }
    @GetMapping("/{id}")
    private Mono<Employee> getEmployeeById(@PathVariable String id) {
        return employeeRepository.findEmployeeById(id);
    }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Employee> streamAllEmployee() {
        Flux<Long> fluxLong = Flux.interval(Duration.ofSeconds(2));
        Function<Employee, Publisher<Tuple2<Long, Employee>>> mapper = employee -> Flux.zip(fluxLong, Flux.fromStream(Stream.generate(() -> employee)));
        return employeeRepository.findAllEmployees().flatMap(mapper).map(Tuple2::getT2);
    }


}
