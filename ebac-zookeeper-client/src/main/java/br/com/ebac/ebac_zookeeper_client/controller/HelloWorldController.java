package br.com.ebac.ebac_zookeeper_client.controller;

import br.com.ebac.ebac_zookeeper_client.client.HelloWorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldClient helloWorldClient;

    @GetMapping(path = "/greetings")
    public String helloWorld(){
        return helloWorldClient.HelloWorld();
    }
}
