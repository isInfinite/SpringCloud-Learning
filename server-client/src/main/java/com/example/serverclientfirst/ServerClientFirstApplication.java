package com.example.serverclientfirst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServerClientFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerClientFirstApplication.class, args);
    }

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/server-client")
    public String test(){
        return serverPort;
    }

}
