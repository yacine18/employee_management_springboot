package com.yassine.employee_management.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private long id;
    private String name;
    private int age;
    private int salary;
    private String department;
}
