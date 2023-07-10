package com.JagaExpress.Spring_CRUD.controller;

import com.JagaExpress.Spring_CRUD.entity.Employee;
import com.JagaExpress.Spring_CRUD.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/code")
public class EmployeeController {
    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){

        Employee empById = employeeServiceInterface.getEmpById(id);
        return new ResponseEntity<>(empById,HttpStatus.OK);
    }

//    @PostMapping("/save")
//    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
//        Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
//        return new ResponseEntity<>(employeeSaved, HttpStatus.CREATED);
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Employee>> getAllEmployeeList(){
//        List<Employee> allEmployees = employeeServiceInterface.getAllEmployees();
//        return new ResponseEntity<>(allEmployees,HttpStatus.OK);
//    }



//    @DeleteMapping("/employee/{id}")
//    public void deleteById(@PathVariable long id){
//        employeeServiceInterface.deleteById(id);
//
//    }

//    @PutMapping("/employee/{id}}")
//    public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee employee,@PathVariable long id){
//        Employee updateById = employeeServiceInterface.updateById(id, employee);
//        return new ResponseEntity<>(updateById,HttpStatus.OK);
//
//    }

}
