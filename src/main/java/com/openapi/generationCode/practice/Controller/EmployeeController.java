package com.openapi.generationCode.practice.Controller;


import com.openapi.generationCode.practice.DB.DataBase;
import com.openapi.generationCode.practice.Service.EmployeeService;
import com.openapi.generationCode.practice.api.EmployeeApi;
import com.openapi.generationCode.practice.api.EmployeeApiDelegate;

import com.openapi.generationCode.practice.model.EmployedDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class EmployeeController implements EmployeeApiDelegate{

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public ResponseEntity<List<EmployedDTO>> employeeGet() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(this.employeeService.findAll());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
