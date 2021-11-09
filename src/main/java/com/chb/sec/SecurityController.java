package com.chb.sec;

import com.chb.entities.Coach;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/SecurityController")
@Controller
public class SecurityController extends HttpServlet {

    @RequestMapping(value = "/login" )
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        return "redirect:/login";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletRequest request){
        if(request.isUserInRole("USER"))
        return "redirect:/listClientsDuCoach";
        else if(request.isUserInRole("SUPERADMIN"))
            return "redirect:/tabClient";
        else
            return "/403";
    }

    @RequestMapping(value = "/403")
    public String notAccess(){
        return "403";
    }
}
