package com.springboot.controller;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<String> saveData(@RequestBody Employee employee){
        employeeServiceImpl.saveData(employee);
        return ResponseEntity.ok("Data saved successfully");
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Employee>> getAllData(){
        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<String> updateData(@PathVariable int empId, @RequestBody Employee employee){
        employeeServiceImpl.updateData(empId,employee);
        return ResponseEntity.ok("Data updated successfully");
    }

    @DeleteMapping("deletebyid/{empId}")
    public ResponseEntity<String> deleteDataById(@PathVariable int empId){
        employeeServiceImpl.deleteDataById(empId);
        return ResponseEntity.ok("Data deleted successfully");
    }

    //@PatchMapping is used for partial updation
    @PatchMapping("/patch/{empId}")
    public ResponseEntity<String> patchData(@PathVariable int empId, @RequestBody Employee employee){
        employeeServiceImpl.patchData(empId,employee);
        return ResponseEntity.ok("Patch data successfully");
    }
}
