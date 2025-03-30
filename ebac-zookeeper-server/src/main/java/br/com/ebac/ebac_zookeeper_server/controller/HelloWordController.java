package br.com.ebac.ebac_zookeeper_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/helloworld")
    public String helloWord(){
        return "Hello, World!";
    }

}
