package com.example.fidelity.employee.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.fidelity.employee.model.Employee;

@Component
public class EmployeeDTO {

    List<Employee> employees;

    public EmployeeDTO() {
        if(employees == null) {
            employees = new ArrayList<>();
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
