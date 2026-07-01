package com.employee.employeeManagement.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Stack;

@Entity
@Data
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_name")
    private String name;

    @Column(name = "emp_salary")
    private double salary;

    @ManyToOne
    @JoinColumn(name = "dp_id" )
    private Department department;

    @Column(name = "emp_permanent")
    private boolean permanent;

    @ManyToMany
    @JoinTable(
            name = "emp_skill",
            joinColumns = @JoinColumn (name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "es_d")
        )
    private List<Skills> skillsList;
}
