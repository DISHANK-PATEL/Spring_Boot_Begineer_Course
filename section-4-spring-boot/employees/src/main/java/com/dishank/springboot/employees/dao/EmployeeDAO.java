package com.dishank.springboot.employees.dao;

import com.dishank.springboot.employees.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
