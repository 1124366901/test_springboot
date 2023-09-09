package com.example.test_springboot.infra.mapper;

import com.example.test_springboot.domain.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    List<Course> selAll();
}
