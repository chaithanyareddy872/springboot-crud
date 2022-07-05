package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SampleNotFound extends RuntimeException{

    private Long id;
    private String message;
    private String name;

    public Long getId() {
        return id;
    }

    public SampleNotFound(String message, Long id, String name) {
        super(String.format("%s with %d",message,id));
        this.id = id;
        this.message = message;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String  getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
