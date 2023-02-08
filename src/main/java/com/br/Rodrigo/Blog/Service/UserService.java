package com.br.Rodrigo.Blog.Service;

import com.br.Rodrigo.Blog.Domain.User;
import com.br.Rodrigo.Blog.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

}