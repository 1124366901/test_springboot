package com.example.test_springboot.controller;

import com.example.test_springboot.domain.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StuController_Consumer {
    private static final String REST_URL_PROVIDER_PREFIX = "http://MICROSERVICECLOUDPROVIDERDEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/stu/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/stu/get/" + id,Student.class);

    }
    @RequestMapping(value = "/consumer/stu/all")
    public List<Student> list(){
        return restTemplate.getForObject(REST_URL_PROVIDER_PREFIX + "/stu/all", List.class);

    }
}
