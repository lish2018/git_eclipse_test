package com.lish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Lish
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lish.springcloudtest"})
@ComponentScan("com.lish.springcloudtest")
public class DeptConsumer80_Feign_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}
}
