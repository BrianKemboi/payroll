package com.example.payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.payroll.model.Employee;
import com.example.payroll.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		
		   return args -> {
			      log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
			      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
			    };
	}

}
