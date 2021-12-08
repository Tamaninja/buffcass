package me.tamaninja.buffcass.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/buffcass")
public class TestController {

    @GetMapping
    public String helloWorld() {
        return "Hello world.";
    }

}
