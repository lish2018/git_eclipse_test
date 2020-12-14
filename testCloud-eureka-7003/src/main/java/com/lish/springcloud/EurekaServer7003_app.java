package com.lish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Lish
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_app {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7003_app.class,args);
	}
}
