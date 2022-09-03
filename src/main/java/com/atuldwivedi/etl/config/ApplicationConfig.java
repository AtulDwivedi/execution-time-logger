package com.atuldwivedi.etl.config;

import com.atuldwivedi.etl.repository.EmployeeRepository;
import com.atuldwivedi.etl.repositoryimpls.EmployeeRepositoryImpl;
import com.atuldwivedi.etl.service.EmployeeService;
import com.atuldwivedi.etl.serviceimpl.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Atul Dwivedi
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public EmployeeRepository employeeRepository(){
        return new EmployeeRepositoryImpl();
    }

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository){
        return new EmployeeServiceImpl(employeeRepository);
    }
}
