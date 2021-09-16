package com.example.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    
    @GetMapping("/")
    public String getIndexPage(Model model) {
        String message = "Hello, World";
        model.addAttribute("message", message);
        return "index";
    }
}
