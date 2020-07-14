package com.example.springbootaopdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello(String text) {
        return "Hello " + text;
    }
}