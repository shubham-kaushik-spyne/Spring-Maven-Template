package com.codewithmosh.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithmosh.store.entities.*;

@RestController
public class HomeController {
    @RequestMapping("/home")
    public Home home() {
        return new Home("John aaaa", "123 Main St", "Anytown");
    }
}
