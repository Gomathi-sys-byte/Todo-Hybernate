package project.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "project.study.Repository.jpa")
@EntityScan(basePackages = "project.study.model")
@EnableAutoConfiguration
public class StudyApplication {

	public static void main(String[] args) {SpringApplication.run(StudyApplication.class, args);}

}