package com.example.demoeurakaaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "student")
public class AddressController {
    private final RestTemplate restTemplate;

    @Autowired
    public AddressController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/address")
    public Student getCustomerAddress(@RequestParam(value = "studentId") final int studentId) {
        Student student = new Student();
        student.setStudentid(studentId);
        return student;
    }
}