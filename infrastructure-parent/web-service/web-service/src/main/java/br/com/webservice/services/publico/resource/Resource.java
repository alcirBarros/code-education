//package br.com.webservice.services.publico.resource;
//
////import br.com.repository.db.h2.model.Address;
////import br.com.repository.db.h2.repository.AddressRepository;
//import br.com.repository.db.mysql.model.People;
//import br.com.repository.db.mysql.repository.PeopleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Map;
//import javax.annotation.PostConstruct;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.MatrixVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//
//@RestController
////@RequestMapping(value = "/db")
//public class Resource {
//
//    @Autowired
//    private PeopleRepository peopleRepository;
//
////    @Autowired
////    private AddressRepository addressRepository;
//    
//    @PostConstruct
//    public void init() {
//        System.out.println(this.getClass().getName());
//    }
//
//    @RequestMapping(value = "/companyEmployee/{company}/employeeData/{employee}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<Map<String, String>> getEmployeeDataFromCompany(@MatrixVariable(pathVar = "employee") final Map<String, String> matrixVars) {
//        return new ResponseEntity<>(matrixVars, HttpStatus.OK);
//    }
//
////    @GetMapping(value = "/h2")
////    public ResponseEntity<List<Address>> testH2() {
////        return ResponseEntity.ok(addressRepository.findAll());
////    }
//    
//    @GetMapping(value = "/mysql")
//    public ResponseEntity<List<People>> testMysql() {
//        List<People> findAll = peopleRepository.findAll();
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Responded", "MyController");
//        return ResponseEntity.accepted().headers(headers).body(findAll);
//    }
//
//    @GetMapping(path = "/mysql_v2")
//    public ResponseEntity<List<People>> test() {
//        List<People> findAll = peopleRepository.findAll();
//
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.add("Responded", "MyController");
//
//        return new ResponseEntity<>(findAll, responseHeaders, HttpStatus.OK);
//    }
//}
