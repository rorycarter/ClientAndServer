package com.roryCarter.Domain;

import javax.persistence.*;

@Entity
public class Employee  {

    @Id
    private String employeeId;

    private String firstName;
    private String lastName;
    private String password;
    private String jobDescription;




    @OneToMany(fetch= FetchType.EAGER)
    @JoinColumn(name="employee_id")

    //private List<User> custList;
    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getPassword() {
        return password;
    }

    public String getJobDescription() {
        return jobDescription;
    }
    public Employee()
    {




    }

    public Employee (Builder builder)
    {
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.jobDescription = builder.jobDescription;
    }

    public static class Builder
    {
        private String employeeId;
        private String firstName;
        private String lastName;
        private String password;
        private String jobDescription;

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }


        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Builder jobDescription(String jobDescription)
        {
            this.jobDescription = jobDescription;
            return this;
        }

        public Builder employeeId(String employeeId)
        {
            this.employeeId= employeeId;
            return this;
        }

        public Builder copy(Employee employee)
        {
            this.employeeId = employee.employeeId;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.password = employee.password;
            this.jobDescription = employee.jobDescription;

            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }
    }


    public boolean equals(Object o)
    {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return employeeId.equals(employee.employeeId);
    }


    public int hashCode()
    {
        return employeeId.hashCode();
    }


    public String toString()
    {
        return "Name: " + firstName + "" + "Surname: " + lastName + "Id.: " + employeeId;
    }
}



