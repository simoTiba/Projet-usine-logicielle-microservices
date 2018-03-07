package org.opendevup;
import org.opendevup.entity.Diplome;
import org.opendevup.repository.DiplomeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories 
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
public class DiplomeServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=(ApplicationContext)SpringApplication.run(DiplomeServiceApplication.class, args);
		DiplomeRepository diplomeRepository=ctx.getBean(DiplomeRepository.class);
		Diplome dip1 = new Diplome("dip1", "Semestre1", "VH1", "code1", "Service11",(long)1);
		Diplome dip2 = new Diplome("dip2", "Semestre2", "VH2", "code2", "Service12",(long)1);
		Diplome dip3 = new Diplome("dip3", "Semestre1", "VH3", "code1", "Service12",(long)2);
		Diplome dip4 = new Diplome("dip4", "Semestre2", "VH4", "code1", "Service11",(long)2);
		Diplome dip5 = new Diplome("dip5", "Semestre1", "VH5", "code2", "Service11",(long)1);
		diplomeRepository.save(dip1);
		diplomeRepository.save(dip2);
		diplomeRepository.save(dip3);
		diplomeRepository.save(dip4);
		diplomeRepository.save(dip5);
		diplomeRepository.findAll().forEach(x->System.out.println(x.getIdDiplome()));

		}
}

