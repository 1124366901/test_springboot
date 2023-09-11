package com.example.demoinstance8001.controller;


import com.example.demoinstance8001.entity.Student;
import com.example.demoinstance8001.service.FeignService;
import com.example.demoinstance8001.service.StudentService;
import com.example.demoinstance8001.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {

    @Autowired
    private StudentServiceImpl stuService;
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/stu/get/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable("id") int id) {
        return stuService.getStuByID(id);
    }
    @RequestMapping(value = "/stu/all", method = RequestMethod.GET)
    public List<Student> list() {
        return stuService.getAllStu();
    }

    @RequestMapping(value = "/stu/feign", method = RequestMethod.GET)
    public List<Student> feignAll() {
        return feignService.getAll();
    }
}
