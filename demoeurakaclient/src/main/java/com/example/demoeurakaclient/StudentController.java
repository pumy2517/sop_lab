package com.example.demoeurakaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "student")
public class StudentController {
    private final RestTemplate restTemplate;

    @Autowired
    public StudentController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/search")
    public Student getCustomer(@RequestParam(value = "studentId") final String id) {
        String url = "http://ADDRESS-SERVICE/student/address?studentId=" + id;
        return restTemplate.getForObject(url, Student.class);
    }
    @GetMapping("/ss")
    public String getCustomer2(@RequestParam(value = "id") final String id) {
        return id;
    }
}