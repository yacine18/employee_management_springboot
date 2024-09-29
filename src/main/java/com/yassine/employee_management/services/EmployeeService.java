package com.yassine.employee_management.services;

import com.yassine.employee_management.dto.EmployeeDto;
import com.yassine.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee postEmployee(EmployeeDto employeeDto);

    Employee saveOrUpdateEmployee(Employee employee, EmployeeDto employeeDto);
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);
}
