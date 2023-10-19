package org.acme.hellokubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class HelloKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloKubernetesApplication.class, args);
	}

}
