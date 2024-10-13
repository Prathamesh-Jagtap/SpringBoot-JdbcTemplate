package com.springboot.dao;

import com.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    String Insert_SQL="insert into employee(empid, empname, empsalary, empdob)values(?,?,?,?)";
    String Select_SQL="select * from employee";
    String Update_SQL="update employee set empname=?, empsalary=?,empdob=? where empid=?";
    String PatchUpdate_SQL="update employee set empsalary=? where empid=?";

    String Delete_SQL="delete from employee where empid=?";

    private Employee employee(ResultSet resultSet, int numRow) throws SQLException {
        return Employee.builder().empId(resultSet.getInt(1)).empName(resultSet.getString(2)).empSalary(resultSet.getDouble(3)).empDOB(resultSet.getDate(4)).build();
    }

    @Override
    public void saveData(Employee employee) {
        jdbcTemplate.update(Insert_SQL,employee.getEmpId(),employee.getEmpName(),employee.getEmpSalary(),employee.getEmpDOB());
    }

    @Override
    public List<Employee> getAllData() {
        return jdbcTemplate.query(Select_SQL,this::employee);
    }

    @Override
    public void updateData(int empId, Employee employee) {
        jdbcTemplate.update(Update_SQL,employee.getEmpName(),employee.getEmpSalary(),employee.getEmpDOB(),empId);

    }

    @Override
    public void deleteDataById(int empId) {
        jdbcTemplate.update(Delete_SQL,empId);

    }

    @Override
    public void patchData(int empId, Employee employee) {
        jdbcTemplate.update(PatchUpdate_SQL,employee.getEmpSalary(),empId);

    }
}
