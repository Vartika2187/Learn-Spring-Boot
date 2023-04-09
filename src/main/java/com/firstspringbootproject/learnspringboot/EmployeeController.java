package com.firstspringbootproject.learnspringboot;

//create a simple REST API - work
//employee : id, position, manager, feedback

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {


    @RequestMapping("/work")
    public List<Employee> getEmployeeDetails(){
        return Arrays.asList( new Employee("vartika.yadava@decurtis.com", "Trainee Java Developer", "Kapil Gupta", "It's the best place to work at!"),
                              new Employee("abhishek.sharma@decurtis.com", "Java Developer", "Kapil Gupta", "It's Good...!"),
                              new Employee("tinkle.singh@decurtis.com", "React Developer", "Ishan Trivid", "Okay, like it")
                              );
    }
}
