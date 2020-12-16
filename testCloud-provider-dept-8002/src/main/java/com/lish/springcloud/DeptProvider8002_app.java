package com.lish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Lish
 *
 */
@SpringBootApplication
@EnableEurekaClient 
@EnableDiscoveryClient
public class DeptProvider8002_app {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002_app.class,args);
	}
}
