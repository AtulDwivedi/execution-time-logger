package com.atuldwivedi.etl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class ExecutionTimeLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExecutionTimeLoggerApplication.class, args);
	}

}
