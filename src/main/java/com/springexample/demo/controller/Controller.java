package com.springexample.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    private String testInit() {
        return "Inicial";
    }

    @GetMapping("/hello")
    private String testHello() {
        return "Hello";
    }

    @GetMapping("/new")
    private String testNew() {
        return "New";
    }
}
