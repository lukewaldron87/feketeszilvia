package com.feketeszilvia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BannerController {

    //@GetMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @GetMapping("/bio")
    public String bio() {
        return "bio";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

}
