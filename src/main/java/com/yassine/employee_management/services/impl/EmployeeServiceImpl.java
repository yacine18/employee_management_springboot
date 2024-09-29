package com.yassine.employee_management.services.impl;

import com.yassine.employee_management.dto.EmployeeDto;
import com.yassine.employee_management.entity.Employee;
import com.yassine.employee_management.repository.EmployeeRepository;
import com.yassine.employee_management.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee postEmployee(EmployeeDto employeeDto) {

        return saveOrUpdateEmployee(new Employee(),employeeDto);
    }

    @Override
    public Employee saveOrUpdateEmployee(Employee employee , EmployeeDto employeeDto) {
        employee.setName(employeeDto.getName());
        employee.setAge(employee.getAge());
        employee.setSalary(employee.getSalary());
        employee.setDepartment(employeeDto.getDepartment());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public Employee updateEmployee(Long id , EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
