package com.example.test_springboot.infra.mapper;

import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.domain.entity.Student;
import com.example.test_springboot.domain.entity.student.StudentTranscript;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SpringbootMapper {

    Student getStu(Integer id);

    List<StudentTranscript>  getStuAch(Integer sid);

    List<StudentTranscript>  getAllStuAch();

    void insertScore(List<Achievement> achievement);

}
