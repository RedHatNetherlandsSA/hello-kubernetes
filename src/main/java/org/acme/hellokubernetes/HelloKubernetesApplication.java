package org.acme.hellokubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = "org.acme.hellokubernetes")
public class HelloKubernetesApplication {

	public static void main(String[] args) {
		 ApplicationContext applicationContext = SpringApplication.run(HelloKubernetesApplication.class, args);
		 for(String beanName : applicationContext.getBeanDefinitionNames()){
			if (applicationContext.getBean(beanName).getClass().getPackageName().startsWith("org.acme.hellokubernetes"))
			 	System.out.println(beanName);
		 }

	}

}
