package com.SpringSecurity.JWTAuthentication.controller;

import com.SpringSecurity.JWTAuthentication.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

 private  final JWTService jwtService;

    public HomeController(JWTService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping("/all-user")
    public String getUser(){
        return  "hi";
    }
    @PostMapping("/login")
    public String usrLogin(){
        return jwtService.getJWTToken();
    }

@GetMapping("/username")
    public String getUserName(@RequestParam String token){
        return jwtService.getUserName(token);
}

}
