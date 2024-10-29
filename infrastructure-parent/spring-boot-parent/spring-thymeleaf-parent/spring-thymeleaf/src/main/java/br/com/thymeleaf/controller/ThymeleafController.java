package br.com.thymeleaf.controller;

import br.com.thymeleaf.model.User;
import br.com.thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ThymeleafController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String list(@PageableDefault(size = 5) Pageable pageable, ModelMap model) {
        Page<User> userPage = userService.findAll(pageable);
        model.addAttribute("userPage", userPage);
        return "index";
    }
}
