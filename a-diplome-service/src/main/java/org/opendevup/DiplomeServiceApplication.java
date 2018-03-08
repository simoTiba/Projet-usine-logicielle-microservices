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
		Diplome dip1 = new Diplome("dip1", "L1", "Diplome Licence", false, 10, 10, 5,2,"Informatique","s011", (long)1);
		Diplome dip2 = new Diplome("dip2", "L2", "Diplome Licence", false, 10, 10, 5,2,"Mathematique","s02", (long)2);
		Diplome dip3 = new Diplome("dip3", "L3", "Diplome Licence", false, 10, 10, 5,2,"Informatique","s02", (long)1);
		Diplome dip4 = new Diplome("dip4", "M1", "Diplome Master", false, 10, 10, 5,2,"Mathematique","s01", (long)3);
		Diplome dip5 = new Diplome("dip5", "M2", "Diplome Master", false, 10, 10, 5,2,"Mathematique","s01", (long)3);

		diplomeRepository.save(dip1);
		diplomeRepository.save(dip2);
		diplomeRepository.save(dip3);
		diplomeRepository.save(dip4);
		diplomeRepository.save(dip5);
		diplomeRepository.findAll().forEach(x->System.out.println(x.getIdDiplome()));

		}
}

