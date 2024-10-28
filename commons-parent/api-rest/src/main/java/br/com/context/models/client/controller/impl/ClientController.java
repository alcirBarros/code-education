//package br.com.apirest.models.client.controller.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.apirest.models.client.controller.IClientController;
//import br.com.apirest.models.client.entity.Client;
//import br.com.apirest.models.client.services.IClientService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//import io.swagger.annotations.Authorization;
//import java.time.LocalDate;
//import java.util.List;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@RestController
//@RequestMapping("/v1/client")
//@Api(value = "onlinestore", description = "Operations pertaining to clients in Online Store", consumes = "Clientesss")
//public class ClientController implements IClientController {
//
//    private IClientService clientService;
//
//    @Autowired
//    public void setClientService(IClientService clientService) {
//        this.clientService = clientService;
//    }
//
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "View a list of available clients", response = Iterable.class)
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Successfully retrieved list"),
//        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
//    })
//    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
//    @Override
//    //Fetches all articles
//    @GetMapping(value = "list")
//    public ResponseEntity<List<Client>> list() {
//        List<Client> clientList = clientService.listAllClients();
//        System.out.println("ClientController::list():List Size:" + clientList.toString());
//        clientList.forEach(client -> client.getCredential().setPassword(""));
//        return new ResponseEntity<List<Client>>(clientList, HttpStatus.OK);
//    }
//
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Search a client with an ID", response = Client.class)
//    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET, produces = "application/json")
//    @Override
//    public ResponseEntity<?> findById(@PathVariable Integer id) {
//        return clientService.findById(id)
//                .map(record -> {
//                    return ResponseEntity.ok().body(record);
//                }).orElse(ResponseEntity.notFound().build());
//    }
//
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Add a client")
//    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
//    @Override
//    public ResponseEntity<?> add(@RequestBody Client domainObject) {
//        if (domainObject.getCredential() != null) {
//            domainObject.getCredential().setRole(this.clientService.findRoleByName("CLIENT"));
//        }
//        System.out.println(domainObject.toString());
////        return clientService.save(domainObject);
//        return null;
//    }
//
//    @Override
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Update a client")
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
//    @PutMapping("/update/{id}")
//    public ResponseEntity update(@PathVariable("id") Integer id, @RequestBody Client client) {
//        return clientService.findById(id)
//                .map(record -> {
//                    record.setName(client.getName());
//                    Client updated = clientService.save(record);
//                    return ResponseEntity.ok().body(updated);
//                }).orElse(ResponseEntity.notFound().build());
//    }
//
//    @Override
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Delete a client")
//    @DeleteMapping(path = {"/delete/{id}"})
//    public ResponseEntity<?> delete(@PathVariable Integer id) {
//        return clientService.findById(id).map(record -> {
//            clientService.deleteClient(id);
//            return ResponseEntity.ok().body(HttpStatus.OK);
//        }).orElse(ResponseEntity.notFound().build());
//    }
//
//    @RequestMapping(value = "{id}")
//    public ResponseEntity<List<Client>> listDate(@PathVariable("id") String employeeId, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("startDate") LocalDate startDate, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("endDate") LocalDate endDate) {
//
//        System.out.println(employeeId);
//        System.out.println(startDate);
//        System.out.println(endDate);
//        return null;
//    }
//
////    @GetMapping(value = "/api/image/logo")
////    public ResponseEntity<InputStreamResource> getImage() throws IOException {
////       ClassPathResource imgFile = new ClassPathResource("image/grokonez-logo.png");
////       return ResponseEntity
////                .ok()
////                .contentType(MediaType.IMAGE_PNG)
////                .body(new InputStreamResource(imgFile.getInputStream()));
////    }
//}
