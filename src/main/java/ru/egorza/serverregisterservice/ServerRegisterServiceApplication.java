package ru.egorza.serverregisterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerRegisterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegisterServiceApplication.class, args);
	}
}
