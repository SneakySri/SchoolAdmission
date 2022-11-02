package com.SchoolAdmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.SchoolAdmission.model.Admission;
import com.SchoolAdmission.respository.AdmissionRepository;


@SpringBootApplication
public class SchoolAdmissionApplication {
	
	@Autowired
	private AdmissionRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SchoolAdmissionApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			repo.save(new Admission(1L,"Sri","10","male"));
			repo.save(new Admission(2L,"Prasanth","12","male"));
			repo.save(new Admission(3L,"Aakash","15","male"));
		};
   }

}