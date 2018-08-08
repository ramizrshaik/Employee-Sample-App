package com.example.fidelity.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.fidelity.employee.model.Employee;
import com.example.fidelity.employee.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Employee> addEmployee(@RequestBody String employee) {
        Employee emp = new Employee();
        emp.setName(employee);
        return employeeService.addEmployee(emp);
    }

    @RequestMapping(value = "/{index}", method = RequestMethod.DELETE)
    public List<Employee> deleteEmployee(@PathVariable("index") int index) {
        return employeeService.delete(index);

    }

    @RequestMapping(value = "/{index}/{employee}", method = RequestMethod.PUT)
    public List<Employee> updateEmployee(@PathVariable("index") int index,
                                         @PathVariable("employee") String employee) {
        return employeeService.update(index, employee);
    }

}
