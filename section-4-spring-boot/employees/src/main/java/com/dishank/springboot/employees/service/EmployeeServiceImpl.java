package com.dishank.springboot.employees.service;

import com.dishank.springboot.employees.dao.EmployeeDAO;
import com.dishank.springboot.employees.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(long theId) {

        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Transactional
    @Override
    public Employee save(EmployeeRequest employeeRequest) {
        Employee theEmployee = convertToEmployee(0, employeeRequest);
        return employeeRepository.save(theEmployee);
    }

    @Transactional
    @Override
    public Employee update(long id, EmployeeRequest employeeRequest) {
        Employee theEmployee = convertToEmployee(id, employeeRequest);
        return employeeRepository.save(theEmployee);
    }

    @Override
    public Employee convertToEmployee(long id, EmployeeRequest employeeRequest) {
        return new Employee(id, employeeRequest.getFirstName(),
                employeeRequest.getLastName(),
                employeeRequest.getEmail());
    }

    @Transactional
    @Override
    public void deleteById(long theId) {
        employeeRepository.deleteById(theId);
    }
}