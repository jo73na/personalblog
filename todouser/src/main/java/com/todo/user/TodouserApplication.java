package com.todo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TodouserApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodouserApplication.class, args);
	}

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();

    }

}
