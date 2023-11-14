package com.kloudvista.onetoone.service;


import com.kloudvista.onetoone.domain.Employee;
import java.util.List;

public interface EmployeeService {
  void  saveEmployee(Employee employee);
  void  saveEmployees(List<Employee> employee);
  List<Employee> getAll();
  Employee getEmployeeById(long id);
}
