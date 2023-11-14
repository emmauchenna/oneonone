package com.kloudvista.onetoone.service;

import com.kloudvista.onetoone.domain.Employee;
import com.kloudvista.onetoone.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;
    @Override
    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void saveEmployees(List<Employee> employee) {
        repository.saveAll(employee);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> byId = repository.findById(id);
        if(byId.isPresent())
            return byId.get();
        return null;
    }
}
