package com.docker.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class JenkinsDockerIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
	}


	@GetMapping("/path")
	public String getMethodName() {
		return "Durgesh:";
	}


}
