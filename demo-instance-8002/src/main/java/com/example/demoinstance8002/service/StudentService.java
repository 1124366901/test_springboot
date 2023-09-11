package com.example.demoinstance8002.service;



import com.example.demoinstance8002.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStu();

    Student getStuByID(Integer id);
}
