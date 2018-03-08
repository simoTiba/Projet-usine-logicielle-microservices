package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Enseignant;
import com.example.demo.repository.EnseignantRepository;

@EnableAutoConfiguration
@SpringBootApplication
public class EnseignantServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(EnseignantServiceApplication.class, args);
		EnseignantRepository EnseignantRepository = ctx.getBean(EnseignantRepository.class);
		
		Enseignant m1 = new Enseignant((long) 1,"Stephane", "Lopes","Responsable");
		Enseignant m2 = new Enseignant((long) 2,"Kedad", "Zoubida","Responsable");
		Enseignant m3 = new Enseignant((long) 3,"Taher", "Yehya","Maitre de conférence");

		EnseignantRepository.save(m1);
		EnseignantRepository.save(m2);
		EnseignantRepository.save(m3);

		
		EnseignantRepository.findAll().forEach(m->System.out.println(m.getPrenom()));

	}
}
