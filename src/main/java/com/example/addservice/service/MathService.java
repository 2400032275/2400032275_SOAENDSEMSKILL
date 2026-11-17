package com.example.addservice.service;

import com.example.addservice.dto.AddResponse;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public AddResponse add(int num1, int num2) {
        return new AddResponse(num1, num2, num1 + num2);
    }
}
