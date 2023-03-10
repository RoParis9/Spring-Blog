package com.br.Rodrigo.Blog.config;


import com.br.Rodrigo.Blog.Domain.User;
import com.br.Rodrigo.Blog.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User maria = new User(null,"maria","maria@gmail.com");
        User alex= new User(null,"alex","alex@gmail.com");
        User bob= new User(null,"bob","bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,alex,bob));
    }
}