package com.openapi.generationCode.practice.DB;

import com.openapi.generationCode.practice.Employee.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class EmployeeDB implements DAO<Integer, Employee>{

    private DataBase dataBase;

    public EmployeeDB(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Employee findEmployee(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() throws Exception {
        return this.dataBase.getDataBase();
    }

    @Override
    public Boolean deleteEntity(Employee entity) {
        return null;
    }

    @Override
    public List<Employee> findEmployeesByAtributte(Map<String, Object> atributtes) {
        return null;
    }
}
