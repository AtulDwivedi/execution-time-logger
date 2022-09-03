package com.atuldwivedi.etl.serviceimpl;

import com.atuldwivedi.etl.model.Employee;
import com.atuldwivedi.etl.repository.EmployeeRepository;
import com.atuldwivedi.etl.service.EmployeeService;
import com.atuldwivedi.starter.execution.time.tracker.annotation.TrackExecutionTime;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Atul Dwivedi
 */
@Slf4j
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    @TrackExecutionTime
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Override
    @TrackExecutionTime
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getEmployeeById(id);
    }
}
