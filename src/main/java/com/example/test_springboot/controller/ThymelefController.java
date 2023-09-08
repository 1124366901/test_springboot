package com.example.test_springboot.controller;

import com.example.test_springboot.api.service.impl.StudentServiceImpl;
import com.example.test_springboot.domain.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ThymelefController {

    @Resource
    private StudentServiceImpl studentService;

    @RequestMapping({"/", "index"})
    public String main(Model model) {
        model.addAttribute("AllStudents",studentService.getAllStu());
        return "main";
    }

    @PostMapping("/changeStuInfo")
    public String changeStuInfo(Student student) {
        studentService.changeInfo(student);
        return "redirect:/";
    }

    @PostMapping("/deleteStu")
    public String deleteStu(Integer id) {
        studentService.deleteStu(id);
        return "redirect:/";
    }

    @PostMapping("/addStuInfo")
    public String addStuInfo(Student student) {
        studentService.addStu(student);
        return "redirect:/";
    }

}
