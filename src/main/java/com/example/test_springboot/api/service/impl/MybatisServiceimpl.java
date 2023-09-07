package com.example.test_springboot.api.service.impl;

import com.example.test_springboot.api.service.MybatisService;
import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.domain.entity.Student;
import com.example.test_springboot.domain.entity.student.StudentTranscript;
import com.example.test_springboot.infra.mapper.SpringbootMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MybatisServiceimpl implements MybatisService {

    @Autowired
    private SpringbootMapper mapper;

    @Override
    public Student getStu(Integer id) {
        return mapper.getStu(id);
    }
    @Override
    public List<StudentTranscript> getStuAch(Integer sid) {
        return mapper.getStuAch(sid);
    }

    @Override
    public List<StudentTranscript> getAllStuAch() {
        return mapper.getAllStuAch();
    }

    @Override
    public void insertScore(List<Achievement> achievements) {
        mapper.insertScore(achievements);
    }


}
