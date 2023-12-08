package com.openapi.generationCode.practice.Config;

import com.openapi.generationCode.practice.Controller.EmployeeController;
import com.openapi.generationCode.practice.DB.DAO;
import com.openapi.generationCode.practice.DB.DataBase;
import com.openapi.generationCode.practice.DB.EmployeeDB;
import com.openapi.generationCode.practice.Service.EmployeeService;
import com.openapi.generationCode.practice.api.EmployeeApiDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
    @Bean
    public DataBase dataBase(){
        return new DataBase();
    }


    @Bean
    public EmployeeService employeeService(EmployeeDB employeeDB){
        return new EmployeeService(employeeDB);
    }

    @Bean
    public EmployeeApiDelegate employeeController(EmployeeService employeeService){
        return new EmployeeController(employeeService);
    }
}
