package com.atuldwivedi.etl.controller;

import com.atuldwivedi.etl.model.Employee;
import com.atuldwivedi.etl.service.EmployeeService;
import com.atuldwivedi.starter.execution.time.tracker.annotation.TrackExecutionTime;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author Atul Dwivedi
 */
@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @TrackExecutionTime
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @TrackExecutionTime
    @GetMapping("/save")
    public @ResponseBody String saveEmployee() {
        Employee employee = Employee.builder().id(101L).build();
        employeeService.saveEmployee(employee);
        return "Saved Successfully.";
    }
}
