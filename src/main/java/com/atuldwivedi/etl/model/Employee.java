package com.atuldwivedi.etl.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Atul Dwivedi
 */
@Builder
@Data
public class Employee {

    private Long id;

    private String name;

    private int age;
}
