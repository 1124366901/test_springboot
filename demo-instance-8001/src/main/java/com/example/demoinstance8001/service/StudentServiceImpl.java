package com.example.demoinstance8001.service;


import com.example.demoinstance8001.entity.Student;
import com.example.demoinstance8001.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStu() {
        return studentMapper.getAllStu();
    }

    @Override
    public Student getStuByID(Integer id) {
        return studentMapper.getStuByID(id);
    }


}
