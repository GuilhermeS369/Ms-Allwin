package com.mshoow.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrWorker1Application {

	public static void main(String[] args) {
		SpringApplication.run(HrWorker1Application.class, args);
	}

}
