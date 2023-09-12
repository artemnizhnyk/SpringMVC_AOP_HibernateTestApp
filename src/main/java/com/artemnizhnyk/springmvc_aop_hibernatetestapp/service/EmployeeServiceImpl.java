package com.artemnizhnyk.springmvc_aop_hibernatetestapp.service;

import com.artemnizhnyk.springmvc_aop_hibernatetestapp.dao.EmployeeDAO;
import com.artemnizhnyk.springmvc_aop_hibernatetestapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(final Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(final int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(final int id) {
        employeeDAO.deleteEmployee(id);
    }
}
