package com.example.test_springboot.api.service;


import com.example.test_springboot.domain.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStu();

    void changeInfo(Student student);

    void deleteStu(Integer id);

    void addStu(Student student);
}
