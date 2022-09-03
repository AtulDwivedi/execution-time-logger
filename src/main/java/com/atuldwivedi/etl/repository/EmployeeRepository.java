package com.atuldwivedi.etl.repository;

import com.atuldwivedi.etl.model.Employee;

/**
 * @author Atul Dwivedi
 */
public interface EmployeeRepository {
    Employee getEmployeeById(Long id);

    void saveEmployee(Employee employee);
}
