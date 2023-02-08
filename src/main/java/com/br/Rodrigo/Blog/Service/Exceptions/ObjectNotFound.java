package com.br.Rodrigo.Blog.Service.Exceptions;

public class ObjectNotFound extends RuntimeException{
    public ObjectNotFound(String msg){
        super(msg);
    }
}