package com.br.Rodrigo.Blog.Service;

import com.br.Rodrigo.Blog.Domain.User;
import com.br.Rodrigo.Blog.Repositories.UserRepository;
import com.br.Rodrigo.Blog.Service.Exceptions.ObjectNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        if(user == null){
            throw new ObjectNotFound("Object not found");
        }
        return user.get();
    }

}