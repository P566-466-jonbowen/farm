package edu.iu.jonbowen.farm.crop_management.controllers;


import org.springframework.*;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greetings(){
        return "hello from crop management service!" + System.currentTimeMillis();
    }
}