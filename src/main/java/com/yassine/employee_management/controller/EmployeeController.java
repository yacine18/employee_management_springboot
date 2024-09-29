package com.yassine.employee_management.controller;

import com.yassine.employee_management.dto.EmployeeDto;
import com.yassine.employee_management.entity.Employee;
import com.yassine.employee_management.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping()
    public ResponseEntity<?> postEmployee(@RequestBody EmployeeDto employeeDto){
        Employee createdEmployee = employeeService.postEmployee(employeeDto);
        if(createdEmployee != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
