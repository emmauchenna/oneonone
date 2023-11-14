package com.kloudvista.onetoone.controller;

import com.kloudvista.onetoone.domain.Employee;
import com.kloudvista.onetoone.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity saveNurse(@RequestBody Employee nurseReq){
        employeeServiceImpl.saveEmployee(nurseReq);
        return  new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/saveEmployees", method = RequestMethod.POST)
    public ResponseEntity<Employee> saveEmployees(@RequestBody List<Employee> employees){
        employeeServiceImpl.saveEmployees(employees);
        return  new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> getEmployees(){
        List<Employee> all = employeeServiceImpl.getAll();
        return  new ResponseEntity<>(all, HttpStatus.OK);
    }

    @RequestMapping(value = "/get-by/{id}", method = RequestMethod.GET)
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Employee employeeById = employeeServiceImpl.getEmployeeById(id);
        return  new ResponseEntity<>(employeeById, HttpStatus.OK);
    }

}
