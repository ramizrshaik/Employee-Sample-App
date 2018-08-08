package com.example.fidelity.employee.services;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.fidelity.employee.dto.EmployeeDatabase;
import com.example.fidelity.employee.model.Employee;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class EmployeeServiceTest extends TestCase{
    
    @Mock
    EmployeeDatabase dto;
    
    @InjectMocks
    EmployeeService empService;
    
    @Override
    @Before
    protected void setUp() {
        MockitoAnnotations.initMocks(this);
        mockEmployees();
    }
    
    @Test
    public void testGetAllEmployees() {
        List<Employee> empList = empService.getAllEmployees();
        assertEquals(3, empList.size());
        assertEquals("test1", empList.get(0).getName());
        assertEquals("test2", empList.get(1).getName());
        assertEquals("test3", empList.get(2).getName());
    }
    
    private void mockEmployees() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        
        employee1.setName("test1");
        employee2.setName("test2");
        employee3.setName("test3");
        
        List<Employee> empList = new ArrayList<>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        
        when(dto.getEmployees()).thenReturn(empList);
        
    }
    
    
    

}
