package com.JagaExpress.Spring_CRUD.service;

import com.JagaExpress.Spring_CRUD.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeServiceInterface {
//    public Employee addEmployee(Employee employee);
//
//    public List<Employee> getAllEmployees();
    public Employee getEmpById(long id);

//    void deleteById(long id);
//
//    Employee updateById(long id,Employee employee);
}
