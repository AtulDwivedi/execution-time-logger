package com.atuldwivedi.etl.service;

import com.atuldwivedi.etl.model.Employee;

/**
 * @author Atul Dwivedi
 */
public interface EmployeeService {

    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
}
