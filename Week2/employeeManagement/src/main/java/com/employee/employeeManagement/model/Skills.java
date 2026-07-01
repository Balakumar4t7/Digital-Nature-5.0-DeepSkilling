package com.employee.employeeManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
public class Skills {

    @Id
    @Column(name = "es_id")
    private int skillId;

    @Column(name="skill_name")
    private String skillName;

    @ManyToMany(mappedBy = "skillsList")
    private List<Employee> employeeList;

}
