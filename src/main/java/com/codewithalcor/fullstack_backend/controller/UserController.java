package com.codewithalcor.fullstack_backend.controller;


import com.codewithalcor.fullstack_backend.exception.UserNotFoundException;
import com.codewithalcor.fullstack_backend.model.User;
import com.codewithalcor.fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000") // frontend deki urlimizi veriyoruz
public class UserController {

    // interface userRepo'yu inject etmek için
    @Autowired
    private UserRepository userRepository;


    // user post etmek için
    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser); // post işlemi repository interface ile gerçekleştirildi.
    }

    // veritabanından veri çekmek için
    @GetMapping("/users")
    List<User> getAllUser(){ // bir user listesi döndürecek
        return userRepository.findAll(); // this function return the all users
    }

    // şimdi spesifik bir id ile user bilgilerini çekmek için
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));

    }
}
