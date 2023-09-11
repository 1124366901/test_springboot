package com.example.demoinstance8001.service;



import com.example.demoinstance8001.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStu();

    Student getStuByID(Integer id);
}
