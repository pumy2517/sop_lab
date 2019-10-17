//package com.example.demoeurakaclient;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//public class ServiceDiscoveryClient {
//
//        @Autowired
//        private DiscoveryClient discoveryClient;
//
//        @RequestMapping("/student/{studentId}")
//        public Student getStudent(@PathVariable String studentId) {
//            RestTemplate restTemplate = new RestTemplate();
//            List<ServiceInstance> instances = discoveryClient.getInstances(studentId);
//            String serviceUri = String.format("%s/v1/student/%s" ,instances.get(0).getUri().toString(),studentId);
//            ResponseEntity< Student > restExchange = restTemplate.exchange( serviceUri, HttpMethod.GET , null, Student.class, studentId);
//            return restExchange.getBody();
//        }
//    }
//
