package com.padin.finanzas.user;

import com.padin.finanzas.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;
    private final PasswordEncoder encoder;
    private final JwtUtil jwt;

    public User register(User u) {
        u.setPassword(encoder.encode(u.getPassword()));
        u.setRole("USER");
        return repo.save(u);
    }

    public String login(String username, String password) {
        var user = repo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no existe"));

        if (!encoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        return jwt.generateToken(username);
    }
}
