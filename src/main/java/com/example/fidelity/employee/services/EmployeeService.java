package com.example.fidelity.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fidelity.employee.dto.EmployeeDTO;
import com.example.fidelity.employee.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDTO dto;

    public List<Employee> getAllEmployees() {
        return dto.getEmployees();
    }

    public List<Employee> addEmployee(Employee employee) {
        dto.getEmployees().add(employee);
        return dto.getEmployees();
    }

    public List<Employee> delete(int index) {
        dto.getEmployees().remove(index);
        return dto.getEmployees();
    }

    public List<Employee> update(int index, String name) {
        Employee employee = dto.getEmployees().get(index);
        employee.setName(name);
        return dto.getEmployees();
    }

}
