package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class WeBserviceCurdOpretionApplication {

	public static void main(String[] args) {
		
		System.out.println("web service crud opretion");
		SpringApplication.run(WeBserviceCurdOpretionApplication.class, args);
	}

}
