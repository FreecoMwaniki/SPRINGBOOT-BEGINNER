package com.example.springSecurityAdmin.User.Login;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
public class GreetingsController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Bonjour";
    }
    @PostMapping
    public String saveEmployee(){
        return "You have saved a new employee";
    }
    @PutMapping
    public String updateEmployee
}
