package com.example.discriminant.controllers;


import com.example.discriminant.Entity.Equation;
import com.example.discriminant.Service.EqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private EqService service;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewEquation (@RequestParam Double a
            , @RequestParam Double b, @RequestParam Double c) {

        service.calculateResult(a, b, c);
        return "added";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Equation> getAllUsers() {
        return service.findAll();
    }
}
