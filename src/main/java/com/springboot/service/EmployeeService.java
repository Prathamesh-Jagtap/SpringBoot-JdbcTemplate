package com.springboot.service;

import com.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {

    public void saveData(Employee employee);

    public List<Employee> getAllData();

    public void updateData(int empId, Employee employee);

    public void deleteDataById(int empId);

    void patchData(int empId, Employee employee);
}
