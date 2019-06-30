package com.springfirst.cloud.configlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootConfigLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigLocalApplication.class, args);
	}

}
