package com.example.test_springboot.api.service.impl;

import com.example.test_springboot.api.service.StudentService;
import com.example.test_springboot.domain.entity.Student;
import com.example.test_springboot.infra.mapper.StudentMapper;
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
    public void changeInfo(Student student) {
        studentMapper.changeInfo(student);
    }

    @Override
    public void deleteStu(Integer id) {
        studentMapper.deleteStu(id);
    }

    @Override
    public void addStu(Student student) {
        studentMapper.addStu(student);
    }
}
