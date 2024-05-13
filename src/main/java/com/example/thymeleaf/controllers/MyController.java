package com.example.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.entities.User;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MyController {
    
    @GetMapping("/")
    public String getLoginPage(Model model) {
        model.addAttribute("loginData", new User());
        return  "login";
    }

    @PostMapping("/process")
    public String processRequest(@Valid @ModelAttribute  User user, BindingResult result) {
        System.out.println("I am in process");
        System.out.println(user);
        System.out.println(result);
        if(result.hasErrors()) {
            System.out.println("Wrong input");
        }
        return "process";
    }
    
}
