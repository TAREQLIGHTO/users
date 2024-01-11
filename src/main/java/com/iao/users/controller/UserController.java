package com.iao.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/manager")
    public void manager(){
        System.out.println("test");

    }
}
