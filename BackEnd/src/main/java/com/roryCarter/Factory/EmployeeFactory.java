package com.roryCarter.Factory;

import com.roryCarter.Domain.Employee;
import com.roryCarter.Utility.KeyGenerator;

public class EmployeeFactory {


    public static Employee buildEmployee(String employeeId,String firstName, String lastName, String password, String jobDescription) {

        Employee employee = new Employee.Builder()
                .employeeId(employeeId)
                .firstName(firstName)
                .lastName(lastName)
                .password(password)
                .jobDescription(jobDescription)
                .build();
        return employee;
    }
}
