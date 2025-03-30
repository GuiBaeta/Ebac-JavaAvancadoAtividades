package br.com.ebac.ebac_zookeeper_client.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableDiscoveryClient
@EnableFeignClients
@Configuration
public class HelloWorldClient {

    @Autowired
    private HWClient hwClient;

    @FeignClient(name ="HelloWorld")
    interface HWClient {
        @RequestMapping(path = "/helloworld", method = RequestMethod.GET)
        @ResponseBody
        String helloWord();
    }

    public String HelloWorld() {
        return hwClient.helloWord();
    }
}
