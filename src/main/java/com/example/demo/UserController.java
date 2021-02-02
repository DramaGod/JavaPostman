package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    private String dbUser = "admin";
    private String dbPassword = "admin";

    @PostMapping("/login")
    ResponseEntity<User> login(@Valid @RequestBody User user) {
        // persisting the user

        if (dbUser.equals(user.getName()) && dbPassword.equals(user.getPassword())){

            if (!(user.getUserBalance() <= 20)){
                return
            }
            return ResponseEntity.ok(user);

        }
        return ResponseEntity.ok(new User("no","no","no"));

    }

    // standard constructors / other methods

}
