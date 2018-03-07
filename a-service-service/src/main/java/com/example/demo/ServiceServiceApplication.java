package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.example.demo.entity.Service;
import com.example.demo.repository.ServiceRepository;


@EnableJpaRepositories 
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
public class ServiceServiceApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx=(ApplicationContext) SpringApplication.run(ServiceServiceApplication.class, args);
		ServiceRepository ServiceRepository = ctx.getBean(ServiceRepository.class);
		Service serv1=new Service("Service11", "prov1", "etat1",(long) 1, "dip1");
		Service serv2=new Service("Service12", "prov2", "etat2",(long) 2, "dip2");
		ServiceRepository.save(serv1);
		ServiceRepository.save(serv2);
		ServiceRepository.findAll().forEach(x->System.out.println(x.getUeId()));		
	}	
}
