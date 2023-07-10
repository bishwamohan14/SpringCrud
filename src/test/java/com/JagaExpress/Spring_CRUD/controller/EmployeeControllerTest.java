package com.JagaExpress.Spring_CRUD.controller;

import com.JagaExpress.Spring_CRUD.entity.Employee;
import com.JagaExpress.Spring_CRUD.repository.EmployeeCrudRepository;
import com.JagaExpress.Spring_CRUD.service.EmployeeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class EmployeeControllerTest {

    @InjectMocks
    EmployeeService employeeService;

    @Mock
    EmployeeCrudRepository repo;

    @Test
    @DisplayName("test will pass if employee 1 returns decode as value")
   public void getEmployeeById() {
        when(repo.findById(1L)).thenReturn(createEmployeeStub());
        Employee testedEmployee = employeeService.getEmpById(1L);
        assertEquals(testedEmployee.getName(),"decode");
    }

    private Optional<Employee> createEmployeeStub(){
        Employee stubEmp = Employee.builder().id(1L).name("decode").build();
        return Optional.ofNullable(stubEmp);
    }
}