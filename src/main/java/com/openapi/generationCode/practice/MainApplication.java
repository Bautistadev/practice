package com.openapi.generationCode.practice;

import com.openapi.generationCode.practice.DB.DataBase;
import com.openapi.generationCode.practice.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class MainApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MainApplication.class, args);

	}

	@Autowired
	private ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		DataBase db = context.getBean(DataBase.class);
		db.getDataBase().add(new Employee(2,"BAUTISTA","BASILIO",43463078));
	}
}
