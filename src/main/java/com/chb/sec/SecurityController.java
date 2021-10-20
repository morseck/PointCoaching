package com.chb.sec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class SecurityController {

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home(Model model, Principal principal){
        String name= principal.getName();
        model.addAttribute("username", name);
        return "redirect:/listClient";
    }

    @RequestMapping(value = "/404")
    public String notAccess(){
        return "notAuthorized";
    }
}
