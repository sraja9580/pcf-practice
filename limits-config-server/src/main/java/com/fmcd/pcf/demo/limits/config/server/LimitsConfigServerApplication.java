package com.fmcd.pcf.demo.limits.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LimitsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsConfigServerApplication.class, args);
	}

}
