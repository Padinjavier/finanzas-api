package com.padin.finanzas.security;

import com.padin.finanzas.dto.LoginRequest;
import com.padin.finanzas.model.Usuario;
import com.padin.finanzas.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        Usuario user = usuarioRepository.findByEmail(request.getEmail()).orElse(null);

        if (user == null) {
            return "Usuario no encontrado";
        }

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return "Contraseña incorrecta";
        }

        return jwtUtil.generateToken(user.getEmail());
    }
}
