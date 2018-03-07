package org.opendevup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableFeignClients
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication

public class AProxyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AProxyServiceApplication.class, args);
		
	}
}
