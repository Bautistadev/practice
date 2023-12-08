package com.openapi.generationCode.practice.DB;


import com.openapi.generationCode.practice.Employee.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class DataBase {

    private List<Employee> EmployeeDB;

    public DataBase(){
        EmployeeDB = new ArrayList<>();
        EmployeeDB.add(new Employee(1,"BAUTISTA","BASILIO",43463078));
    }

    public List<Employee> getDataBase(){
        return EmployeeDB;
    }
}
