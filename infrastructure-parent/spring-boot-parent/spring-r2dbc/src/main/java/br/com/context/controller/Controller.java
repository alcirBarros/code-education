//package br.com.context.controller;
//
//import br.com.context.enumerator.StatusESocialEventEnum;
//import br.com.context.model.ESocialEventEntity;
////import br.com.context.service.EmployeeService;
//import lombok.AllArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//
//@RestController
//@AllArgsConstructor
//@RequestMapping("/v1/esocialcenter")
//public class Controller {
//
//    private final EmployeeService employeeService;
//    @GetMapping("/status/{status}")
//    private Mono<Page<ESocialEventEntity>> getEmployeeById(@PathVariable String status) {
//        StatusESocialEventEnum statusESocialEventEnum = StatusESocialEventEnum.valueOf(status);
//        Pageable pageable = PageRequest.of(0, 100);
//        return employeeService.findAllByStatus(statusESocialEventEnum, pageable);
//    }
//
//    @GetMapping("/status/{status}")
//    private Page<ESocialEventEntity> getEmployeeById(@PathVariable String status) {
//        StatusESocialEventEnum statusESocialEventEnum = StatusESocialEventEnum.valueOf(status);
//        Pageable pageable = PageRequest.of(0, 100);
//        return employeeService.findAllByStatus(statusESocialEventEnum, pageable);
//    }
//}
