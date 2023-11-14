package com.kloudvista.onetoone.controller;


import com.kloudvista.onetoone.domain.BioDetail;
import com.kloudvista.onetoone.domain.Employee;
import com.kloudvista.onetoone.service.BioDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biodetails")
public class BioDetailController {

    @Autowired
    private BioDetailServiceImpl bioDetailServiceImpl;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity saveBioDetail(@RequestBody BioDetail biodetail){
        bioDetailServiceImpl.saveBioDetail(biodetail);
        return  new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/saveEmployees", method = RequestMethod.POST)
    public ResponseEntity<Employee> saveBioDetails(@RequestBody List<BioDetail> employees){
        bioDetailServiceImpl.saveBioDetails(employees);
        return  new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public ResponseEntity<List<BioDetail>> getBioDetails(){
        List<BioDetail> all = bioDetailServiceImpl.getAll();
        return  new ResponseEntity<>(all, HttpStatus.OK);
    }

    @RequestMapping(value = "/get-by/{id}", method = RequestMethod.GET)
    public ResponseEntity<BioDetail> getBioDetailById(@PathVariable long id){
        BioDetail employeeById = bioDetailServiceImpl.getBioDetailById(id);
        return  new ResponseEntity<>(employeeById, HttpStatus.OK);
    }

}
