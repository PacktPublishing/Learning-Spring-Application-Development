package org.packt.Spring.chapter8.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/logoutPage", method = RequestMethod.GET)
    public String logoutPage() {
        return "logout";
    }
     
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
}
