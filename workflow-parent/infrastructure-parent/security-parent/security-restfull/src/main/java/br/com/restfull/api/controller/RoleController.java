package br.com.restfull.api.controller;

import io.swagger.annotations.Api;
import java.util.HashMap;
import java.util.Map;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api()
@RestController
@RequestMapping("/api/security")
@CrossOrigin(origins = "*")
public class RoleController {


    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/teste01", method = RequestMethod.GET)
    public String callMethodRemotely() {
        return "Read-protected method called!";
    }

    @GetMapping("/teste02")
    public Map<String, String> sayHello(@AuthenticationPrincipal Object token) {
        Map<String, String> result = new HashMap<>();
//        result.put("grant type", token.getGrantType());
//        result.put("client id", token.getClientId());
//        result.put("subaccount id", token.getSubaccountId());
//        result.put("zone id", token.getZoneId());
//        result.put("logon name", token.getLogonName());
//        result.put("family name", token.getFamilyName());
//        result.put("given name", token.getGivenName());
//        result.put("email", token.getEmail());
//        result.put("authorities", String.valueOf(token.getAuthorities()));
//        result.put("scopes", String.valueOf(token.getScopes()));
        return result;
    }

    @ResponseBody
    @RequestMapping("teste03")
    public String home01() {
        return "Welcome home!";
    }

    @ResponseBody
    @RequestMapping("teste04")
    @PreAuthorize("permitAll()")
    public String home02() {
        return "Welcome home!";
    }


}
