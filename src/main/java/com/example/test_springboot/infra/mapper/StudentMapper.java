package com.example.test_springboot.infra.mapper;

import com.example.test_springboot.domain.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    List<Student> getAllStu();

    void changeInfo(Student student);

    void deleteStu(Integer id);

    void addStu(Student student);

    Student getStuByName(String name);
}
