package com.example.test_springboot.controller;

import com.example.test_springboot.api.service.impl.AchievementServiceImpl;
import com.example.test_springboot.api.service.impl.CourseServiceImpl;
import com.example.test_springboot.api.service.impl.MybatisServiceImpl;
import com.example.test_springboot.api.service.impl.StudentServiceImpl;
import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.domain.entity.Student;
import com.example.test_springboot.domain.entity.student.StudentTranscript;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ThymeleafController {

    @Resource
    private StudentServiceImpl studentService;

    @Resource
    private CourseServiceImpl courseService;

    @Resource
    private MybatisServiceImpl mybatisService;

    @Resource
    private AchievementServiceImpl achievementService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping({"/", "index"})
    public String main(Model model, HttpSession session) {
        model.addAttribute("AllStudents", studentService.getAllStu());
        model.addAttribute("allCourse", courseService.selAll());
        if (session.getAttribute("data") != null) {
            StudentTranscript studentTranscript = new ObjectMapper().convertValue(session.getAttribute("data").toString(), StudentTranscript.class);
            model.addAttribute("data", studentTranscript);

        }
        return "main";
    }

    //修改学生信息
    @PostMapping("/changeStuInfo")
    public String changeStuInfo(Student student) {
        studentService.changeInfo(student);
        return "redirect:/";
    }

    //删除学生
    @PostMapping("/deleteStu")
    public String deleteStu(Integer id) {
        studentService.deleteStu(id);
        return "redirect:/";
    }

    //增加学生
    @PostMapping("/addStuInfo")
    public String addStuInfo(Student student, Achievement achievement) {
        achievement.setSid(student.getId());
        mybatisService.addStuAndScore(student, achievement);
        return "redirect:/";
    }


//    @PostMapping("/getStuScore")
//    public String getStuScore(@RequestBody String sid, HttpSession session) {
//        session.setAttribute("data", mybatisService.getStuAch(Integer.valueOf(JSON.parseObject(sid).get("sid").toString())));
//        return "redirect:/";
//    }

    @PostMapping("/UpdateStuScore")
    public String UpdateStuScore(@RequestBody Map<String, String> jsObject) {
        System.out.println(jsObject);
        Achievement achievement = new Achievement(Integer.valueOf(jsObject.get("id")), Integer.valueOf(jsObject.get("course")), Integer.valueOf(jsObject.get("score")));
        if (jsObject.get("method").equals("insert")) {
            achievementService.addStuScore(achievement);
        } else {
            achievementService.updateStu(achievement);
        }
        return "redirect:/";
    }

}
