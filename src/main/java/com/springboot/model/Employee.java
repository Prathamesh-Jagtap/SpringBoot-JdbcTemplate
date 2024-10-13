package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    private int empId;
    private String empName;
    private double empSalary;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

}
