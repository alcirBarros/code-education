//package br.com.apirest.models.user.controller.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.apirest.models.user.controller.IUserController;
//import br.com.apirest.models.user.entity.User;
//import br.com.apirest.models.user.services.IUserService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//import io.swagger.annotations.Authorization;
//
//@RestController
//@RequestMapping("/v1/user")
//@Api(value = "onlinestore", description = "Operations pertaining to users in Online Store")
//public class UserController implements IUserController {
//
//    private IUserService userService;
//
//    @Autowired
//    public void setUserService(IUserService userService) {
//        this.userService = userService;
//    }
//
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "View a list of available users", response = Iterable.class)
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Successfully retrieved list"),
//        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
//    })
//    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
//    @Override
//    @Transactional
//    public Iterable<User> list() {
//        Iterable<User> listAllUsers = this.userService.listAllUsers();
//        listAllUsers.forEach(user -> user.getCredential().setPassword(""));
//        return listAllUsers;
//    }
//
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Search a order with an ID", response = User.class)
//    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET, produces = "application/json")
//    @Override
//    public User getById(@PathVariable Integer id) {
//        User user = this.userService.getUserById(id);
//        return user;
//    }
//
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Add a user")
//    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
//    @Override
//    public User add(@RequestBody User domainObject) {
//        return this.userService.saveUser(domainObject);
//    }
//
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Update a user")
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
//    @Override
//    public User update(@PathVariable Integer id, @RequestBody User user) {
//        User storedUser = this.userService.getUserById(id);
//        storedUser.setUser(user);
//        if (user.getCredential() != null) {
//            user.getCredential().setRole(this.userService.findRoleByName("ADMIN"));
//        }
//        return this.userService.saveUser(storedUser);
//    }
//
//    @SuppressWarnings({"unchecked", "rawtypes"})
//    @ApiOperation(authorizations = {
//        @Authorization(value = "Bearer")}, value = "Delete a user")
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
//    @Override
//    public ResponseEntity delete(@PathVariable Integer id) {
//        this.userService.deleteUser(id);
//        return new ResponseEntity(HttpStatus.OK);
//    }
//}
