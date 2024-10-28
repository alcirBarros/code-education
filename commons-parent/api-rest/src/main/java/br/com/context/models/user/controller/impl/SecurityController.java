//package br.com.apirest.models.user.controller.impl;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.apirest.models.foundation.entity.Credential;
//import br.com.apirest.models.user.controller.ISecurityController;
//import br.com.apirest.models.user.entity.Autorization;
//import br.com.apirest.models.user.entity.Role;
//import br.com.apirest.models.user.services.IUserService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//
//@RestController
//@RequestMapping("/v1/security")
//@Api(value="onlinestore", description="Operations pertaining to users in Online Store")
//public class SecurityController implements ISecurityController {
//
//	private IUserService userService;
//
//	@Autowired
//	public void setUserService(IUserService userService) {
//		this.userService = userService;
//	}
//
//	@CrossOrigin
//	@PostMapping("/signin")
//	@ApiOperation(value = "Username and Password Authentication endpoint")
//	@ApiResponses(value = {
//			@ApiResponse(code = 400, message = "Something went wrong"),
//			@ApiResponse(code = 422, message = "Invalid username/password supplied")})
//	@Override
//	public Autorization login(@RequestBody  Credential credential) {
//		return userService.signin(credential);
//	}
//
//	@CrossOrigin
//    @ApiOperation(value = "View a list of available users",response = Iterable.class)
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Successfully retrieved list"),
//        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
//    })
//    @RequestMapping(value = "/rolelist", method= RequestMethod.GET, produces = "application/json")
//	@Override
//	@Transactional
//	public Iterable<String> listAllRoles() {
//        List<Role> listAllRoles = (List<Role>) this.userService.listAllRoles();
//        return listAllRoles.stream()
//				.map(s -> s.getName())
//				.filter(Objects::nonNull).collect(Collectors.toList());
//	}
//
//}
