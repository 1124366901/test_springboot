package com.example.demoinstance8002.mapper;


import com.example.demoinstance8002.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface StudentMapper {

    List<Student> getAllStu();


    Student getStuByID(Integer id);
}
