package com.example.addservice.controller;

import com.example.addservice.dto.AddResponse;
import com.example.addservice.service.MathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    // GET http://localhost:8080/ms/add?num1=10&num2=20
    @GetMapping("/add")
    public AddResponse add(@RequestParam int num1,
                           @RequestParam int num2) {
        return mathService.add(num1, num2);
    }
}
