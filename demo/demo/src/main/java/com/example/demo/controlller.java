package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
@RequestMapping("/")
public class controlller
{

    String home() {
        return "Hello World!";
    }
}
