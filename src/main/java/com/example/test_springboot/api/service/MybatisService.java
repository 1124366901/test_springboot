package com.example.test_springboot.api.service;

import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.domain.entity.Student;
import com.example.test_springboot.domain.entity.student.StudentTranscript;
import java.util.List;


public interface MybatisService {

    Student getStu(Integer id);

    List<StudentTranscript> getStuAch(Integer sid);

    List<StudentTranscript>  getAllStuAch();

    void insertScore(List<Achievement> achievements);

    void addStuAndScore(Student student,Achievement achievement);


}
