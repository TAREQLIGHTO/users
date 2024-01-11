package com.iao.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @GetMapping("/manager")
    public void manager(){
        System.out.println("test");

    }
    @RequestMapping("/")
    public String showHomePage() {
        return "home";
    }

    @RequestMapping("/employee")
    public String showEmployeePage() {
        return "employee";
    }

    @RequestMapping("/edit")
    public String editEmployeePage() {
        return "editEmployee";
    }
}
