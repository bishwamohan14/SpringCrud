package com.JagaExpress.Spring_CRUD.repository;

import com.JagaExpress.Spring_CRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCrudRepository extends JpaRepository<Employee,Long> {
}
