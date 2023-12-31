package com.example.demoinstance8002.controller;


import com.example.demoinstance8002.entity.Student;
import com.example.demoinstance8002.service.StudentService;
import com.example.demoinstance8002.service.StudentServiceImpl;
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

    @RequestMapping(value = "/stu/get/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable("id") int id) {
        return stuService.getStuByID(id);
    }
    @RequestMapping(value = "/stu/all", method = RequestMethod.GET)
    public List<Student> list() {
        return stuService.getAllStu();
    }
}
