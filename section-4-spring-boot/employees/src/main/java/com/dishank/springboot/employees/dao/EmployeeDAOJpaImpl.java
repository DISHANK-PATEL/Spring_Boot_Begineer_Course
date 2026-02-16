package com.dishank.springboot.employees.dao;

import com.dishank.springboot.employees.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private final EntityManager entityManager;

    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> query =
                entityManager.createQuery("FROM Employee", Employee.class);

        return query.getResultList();
    }

    @Override
    public Employee findById(long theId) {
        return entityManager.find(Employee.class, theId);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return entityManager.merge(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(long theId) {

        Employee employee = entityManager.find(Employee.class, theId);

        if (employee != null) {
            entityManager.remove(employee);
        }
    }
}
