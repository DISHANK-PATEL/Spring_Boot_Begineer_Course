package com.dishank.springboot.employees.dao;

import com.dishank.springboot.employees.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}