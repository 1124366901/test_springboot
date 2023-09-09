package com.example.test_springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.JSON;
import com.example.test_springboot.api.service.impl.CourseServiceImpl;
import com.example.test_springboot.api.service.impl.MybatisServiceImpl;
import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.domain.entity.Course;
import com.example.test_springboot.domain.entity.Student;
import com.example.test_springboot.domain.entity.student.StudentTranscript;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.google.inject.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class MybatisController {

    @Autowired
    MybatisServiceImpl serviceimpl;

    @Resource
    private MybatisServiceImpl mybatisService;

    @Resource
    private CourseServiceImpl courseService;

    @PostMapping("/GetStu")
    public String GetStu(String id) {
        return serviceimpl.getStu(Integer.valueOf(id)).toString();
    }

    @PostMapping("/GetStuAchievement")
    public List<StudentTranscript> GetStuAchievement(String sid) {
        return serviceimpl.getStuAch(Integer.valueOf(sid));
    }

    @PostMapping("/GetAllStuAchievement")
    public List<StudentTranscript> GetAllStuAchievement() {
        return serviceimpl.getAllStuAch();
    }

    @PostMapping("/AddAchievement")
    public String AddAchievement(@RequestBody List<Achievement> achievements) {
        serviceimpl.insertScore(achievements);
        return "true";
    }

    @PostMapping("/getStuScore")
    public List<StudentTranscript> getStuScore(@RequestBody String sid, Model model) {
        model.addAttribute("data",sid);
        return mybatisService.getStuAch(Integer.valueOf(JSON.parseObject(sid).get("sid").toString()));
    }

    @PostMapping("/getAllCourse")
    public List<Course> getAllCourse(){
        return courseService.selAll();
    }


}
