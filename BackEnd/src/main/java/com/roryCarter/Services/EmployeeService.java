package com.roryCarter.Services;

import com.roryCarter.Domain.Employee;

import java.util.List;

public interface EmployeeService extends BaseService<Employee,String>{

    List<Employee> getEmployee();
}
