package com.testeSpring.usuariodept.controllers;

import com.testeSpring.usuariodept.entities.User;
import com.testeSpring.usuariodept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public List<User> findAll(){
        List<User> resultado = userRepository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User resultado = userRepository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public User insert(@RequestBody User user){
        User resultado = userRepository.save(user);
        return resultado;
    }
}
