package com.lish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lish.myselfrule.MyselfRule;

/**
 * @author Lish
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "testCloud-dept",configuration = MyselfRule.class)
public class DeptConsumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
