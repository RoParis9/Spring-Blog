package com.br.Rodrigo.Blog.Controller.Exceptions;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class StandardError implements Serializable {
    private Long timeStamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

}