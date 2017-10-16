package com.roryCarter.Services.impl;

import com.roryCarter.Domain.Employee;
import com.roryCarter.Repository.EmployeeRepository;
import com.roryCarter.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee save(Employee entity)
    {
        return employeeRepository.save(entity);
    }


    public Employee findById(String id)
    {
        return employeeRepository.findOne(id);
    }


    public Employee update(Employee entity)
    {
        return employeeRepository.save(entity);
    }

    public void delete(Employee entity)
    {
        employeeRepository.delete(entity);
    }

    public List<Employee> getEmployee() {
        List<Employee> allcources = new ArrayList<Employee>();

        Iterable<Employee> courses = employeeRepository.findAll();
        for (Employee course : courses) {
            allcources.add(course);
        }
        return allcources;
    }

}

