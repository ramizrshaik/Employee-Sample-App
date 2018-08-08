package com.example.fidelity.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fidelity.employee.dto.EmployeeDatabase;
import com.example.fidelity.employee.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDatabase dto;

    public List<Employee> getAllEmployees() {
        return dto.getEmployees();
    }

    public List<Employee> addEmployee(Employee employee) {
        dto.getEmployees().add(employee);
        return dto.getEmployees();
    }

    public List<Employee> delete(int employeeID) {
        dto.getEmployees().remove(employeeID);
        return dto.getEmployees();
    }

    public Employee update(Employee employee) {
        Employee employee = dto.getEmployees().get(employee.getEmployeeId);
        if(employee !=null) {
            dto.getEmployees().put(employee.getEmployeeId, employee);
            return dto.getEmployees();
            } else {
                return errormessage}
       
        
    }

}
