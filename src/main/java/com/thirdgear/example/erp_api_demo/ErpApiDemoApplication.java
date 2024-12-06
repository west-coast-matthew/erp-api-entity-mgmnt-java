package com.thirdgear.example.erp_api_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"com.thirdgear.example.erp_api_demo"})
@EntityScan(basePackages = {"com.thirdgear.example.erp_api_demo.core.entity"})
public class ErpApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpApiDemoApplication.class, args);
	}
		
}
