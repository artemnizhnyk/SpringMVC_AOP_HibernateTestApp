package com.artemnizhnyk.springmvc_aop_hibernatetestapp.dao;


import com.artemnizhnyk.springmvc_aop_hibernatetestapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
