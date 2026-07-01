package com.employee.employeeManagement.model;

import java.util.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Department {


    @Id
    @Column(name = "dp_id")
    private int dId;

    @OneToMany(mappedBy = "department" , cascade = CascadeType.ALL)
    private List<Employee> employeeList;

    @Column(name = "dp_name")
    private String dName;
}
