package com.netflix.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookController {

    @GetMapping("/get-book")
    @HystrixCommand(fallbackMethod = "defaultGetBook")
    public String getBook(){
        return new RestTemplate().getForObject("http://localhost:8080/books", String.class);
    }

    public String defaultGetBook(){
        return "You can not access other service. Poor you!";
    }
}
