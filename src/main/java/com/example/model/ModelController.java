package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Creating the REST controller
@SpringBootApplication
@RestController
//@RequestMapping(path = "/employees")
public class ModelController {

    @Autowired
    private Model model;
//    private EmployeeDAO employeeDao;

    // Implementing a GET method
    @GetMapping(path = "/", produces = "application/json")
    public int ModelCounts()
    {
        return model.getModelCount();
    }

    // Create a POST method
//    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
//    public int addEmployee(@RequestBody Employee employee)
//    {
//
//        // Creating an ID of an employee
//        // from the number of employees
//        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
//
//        employee.setId(id);
//
//        employeeDao.addEmployee(employee);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId()).toUri();
//        return employeeDao.getAllEmployees();
////        return ResponseEntity
////                .created(location)
////                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ModelController.class, args);
    }
}
