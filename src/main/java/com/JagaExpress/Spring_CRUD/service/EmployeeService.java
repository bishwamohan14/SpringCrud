package com.JagaExpress.Spring_CRUD.service;

import com.JagaExpress.Spring_CRUD.entity.Employee;
import com.JagaExpress.Spring_CRUD.repository.EmployeeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface{

    @Autowired
    private EmployeeCrudRepository repo;

    @Override
    public Employee getEmpById(long id) {
        Employee employee = repo.findById(id).get();
        return employee;
    }

//    @Override
//    public Employee addEmployee(Employee employee) {
//        Employee savedEmployee = repo.save(employee);
//        return savedEmployee;
//    }
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        List<Employee> allEmployees = repo.findAll();
//        return allEmployees;
//    }



//    @Override
//    public void deleteById(long id) {
//        repo.deleteById(id);
//    }

//    @Override
//    public Employee updateById(long id, Employee employee) {
//        Employee employee1 = repo.findById(id).get();
//        employee1.setName(employee1.getName());
//        Employee updated = repo.save(employee1);
//        return updated;
//    }


}
