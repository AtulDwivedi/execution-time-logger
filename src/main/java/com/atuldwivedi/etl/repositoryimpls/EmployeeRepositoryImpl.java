package com.atuldwivedi.etl.repositoryimpls;

import com.atuldwivedi.etl.logger.annotation.TrackExecutionTime;
import com.atuldwivedi.etl.model.Employee;
import com.atuldwivedi.etl.repository.EmployeeRepository;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Atul Dwivedi
 */
@Slf4j
@TrackExecutionTime
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final Faker faker = new Faker();

    @Override
//    @TrackExecutionTime
    public Employee getEmployeeById(Long id) {
        return Employee.builder()
                .id(id)
                .name(faker.name().fullName())
                .age(faker.number().numberBetween(18, 99))
                .build();
    }

    @TrackExecutionTime
    @Override
    public void saveEmployee(Employee employee) {
        log.info("Employee record with ID: {} saved successfully.", employee.getId());
    }
}
