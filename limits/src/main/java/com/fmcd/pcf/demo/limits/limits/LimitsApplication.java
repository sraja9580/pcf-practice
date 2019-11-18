package com.fmcd.pcf.demo.limits.limits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.fmcd.pcf.demo.limits.limits")
public class LimitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsApplication.class, args);
	}

}
