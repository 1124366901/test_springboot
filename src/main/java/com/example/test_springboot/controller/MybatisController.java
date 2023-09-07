package com.example.test_springboot.controller;

import com.example.test_springboot.api.service.impl.MybatisServiceimpl;
import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.domain.entity.student.StudentTranscript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class MybatisController {

    @Autowired
    MybatisServiceimpl serviceimpl;



    @PostMapping("/GetStu")
    public String GetStu(String id) {
        return serviceimpl.getStu(Integer.valueOf(id)).toString();
    }

    @PostMapping("/GetStuAchievement")
    public List<StudentTranscript>  GetStuAchievement(String sid) {
        return serviceimpl.getStuAch(Integer.valueOf(sid));
    }

    @PostMapping("/GetAllStuAchievement")
    public List<StudentTranscript>  GetAllStuAchievement() {
        return serviceimpl.getAllStuAch();
    }

    @PostMapping("/AddAchievement")
    public String AddAchievement(@RequestBody List<Achievement> achievements) {
        serviceimpl.insertScore(achievements);
        return "true";
    }
}
