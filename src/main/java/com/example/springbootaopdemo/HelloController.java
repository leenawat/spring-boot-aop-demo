package com.example.springbootaopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @Autowired private HelloService helloService;

  @LogExecutionTime
  @GetMapping(path = "/hello")
  public String getHello() {
    return helloService.hello("world!");
  }
}
