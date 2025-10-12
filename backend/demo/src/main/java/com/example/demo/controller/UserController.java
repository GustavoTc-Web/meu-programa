package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000") // permite que o React acesse o backend
@RestController
@RequestMapping("/api/usuario")
public class UserController {

    private final UserRepository userRepository;

    // Injeção de dependência via construtor
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Endpoint POST para cadastro de usuário
    @PostMapping("/cadastro")
    public ResponseEntity<User> cadastrar(@RequestBody User usuario) {
        // Salva o usuário no banco
        User salvo = userRepository.save(usuario);

        // Retorna o usuário salvo (incluindo id gerado)
        return ResponseEntity.ok(salvo);
    }
}
