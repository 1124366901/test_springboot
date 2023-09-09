package com.example.test_springboot.api.service.impl;

import com.example.test_springboot.api.service.CourseService;
import com.example.test_springboot.domain.entity.Course;
import com.example.test_springboot.infra.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<Course> selAll() {
        return courseMapper.selAll();
    }
}
