package com.artemnizhnyk.springmvc_aop_hibernatetestapp.service;

import com.artemnizhnyk.springmvc_aop_hibernatetestapp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
