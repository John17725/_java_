package com.demo.demo.Services;

import com.demo.demo.DTO.EmployeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    List<EmployeeDTO> employees = new ArrayList<>(List.of(
            new EmployeeDTO(1,"Jesus"),
            new EmployeeDTO(2,"Diego"),
            new EmployeeDTO(3,"Nieves"),
            new EmployeeDTO(4,"Valeria")
    ));

    public List<EmployeeDTO> getEmployees(){
        return employees;
    }

    public ResponseEntity<EmployeeDTO> getEmployeeById(int id){
        for (EmployeeDTO employee : employees){
            if(employee.getId() == id){
                return ResponseEntity.ok(employee);
            }
        }
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<EmployeeDTO> addEmployee(EmployeeDTO newEmployee){
        employees.add(newEmployee);
        return ResponseEntity.status(HttpStatus.CREATED).body(newEmployee);
    }
}
