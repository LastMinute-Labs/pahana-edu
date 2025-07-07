package com.icbt.pahanaedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "Pahana Education");
        model.addAttribute("message", "Transform Your Future with Quality Education");
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("appName", "Pahana Edu Billing System");
        return "dashboard";
    }

}
