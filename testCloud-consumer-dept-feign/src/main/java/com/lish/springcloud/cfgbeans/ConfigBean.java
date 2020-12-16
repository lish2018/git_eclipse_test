package com.lish.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;

/**
 * @author Lish
 *
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced // spring cloud Ribbon是一个基于Netflix Ribbon实现的一套客户端 负载均衡的工具
	public RestTemplate getRestTemplate() {

		return new RestTemplate();
	}

	@Bean
	public IRule myIRule() {
//		return new RoundRobinRule();  // 默认轮询规则
//		return new RandomRule(); // 随机规则
//		return new AvailabilityFilteringRule(); // 可用性过滤规则
//		return new WeightedResponseTimeRule();// 加权响应时间规则
//		return new RetryRule(); // 反向规则
		return new BestAvailableRule(); // BestAvailable规则
//		return new ZoneAvoidanceRule();// 区域调整规则
	}
}
