package com.example.springSecurityAdmin.User.Login;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
public class GreetingsController {
    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER'or hasRole(ROLE_ADMIN))")
    public String getAllUsers(){
        return "THis are all your Employees";
    }

    @PostMapping("/api")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String saveUsers(){
        return "You have added a user";
    }

    @PutMapping("/user/{ID}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String updateUser(){
        return "you have just updated a user";
    }

    @DeleteMapping("/user/{ID}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteUSer(){
        return "you have just deleted a user";
    }
}
