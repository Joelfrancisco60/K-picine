package com.example.demo;

import config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			HelloService service = c.getBean(HelloService.class);
			service.hello();
		}
	}

}
