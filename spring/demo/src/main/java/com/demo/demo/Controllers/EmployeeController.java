package com.demo.demo.Controllers;

import com.demo.demo.DTO.EmployeeDTO;
import com.demo.demo.Services.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();
    @GetMapping
    public List<EmployeeDTO> getEmployeeById (){
        return employeeService.getEmployees();
    }

    @GetMapping("/{idEmployee}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable int idEmployee){
        try {
            return employeeService.getEmployeeById(idEmployee);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO){
        try {
            return employeeService.addEmployee(employeeDTO);
        }catch (Exception ex){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }



}
