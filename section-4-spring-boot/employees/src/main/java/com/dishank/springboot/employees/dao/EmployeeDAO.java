package com.dishank.springboot.employees.dao;

import com.dishank.springboot.employees.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(long theId);
    Employee save(Employee theEmploeyee);
    void deleteById(long theId);
}
