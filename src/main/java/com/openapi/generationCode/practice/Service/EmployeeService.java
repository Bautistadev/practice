package com.openapi.generationCode.practice.Service;

import com.openapi.generationCode.practice.DB.EmployeeDB;
import com.openapi.generationCode.practice.Employee.Employee;
import com.openapi.generationCode.practice.model.EmployedDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService {

    private EmployeeDB employeeDB;

    public EmployeeService(EmployeeDB employeeDB) {
        this.employeeDB = employeeDB;
    }

    public List<EmployedDTO> findAll() throws Exception {
        List<Employee> listEmpleadoDB = this.employeeDB.getAllEmployee();
        List<EmployedDTO> responseList = new ArrayList<>();

        Iterator<Employee> iterador = listEmpleadoDB.iterator();

        while(iterador.hasNext()){
            EmployedDTO responseDTO = new EmployedDTO();
            Employee em = iterador.next();

            responseDTO.setId(em.getId().longValue());
            responseDTO.setLastname(em.getApellido());
            responseDTO.setName(em.getNombre());
            responseDTO.setDocument(em.getDNI().longValue());

            responseList.add(responseDTO);
        }
        return responseList;
    }
}
