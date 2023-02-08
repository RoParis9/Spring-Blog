package com.br.Rodrigo.Blog.Repositories;

import com.br.Rodrigo.Blog.Domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}