package com.padin.finanzas.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User u) {
        return service.register(u);
    }

    @PostMapping("/login")
    public String login(@RequestBody User u) {
        return service.login(u.getUsername(), u.getPassword());
    }
}
