package com.example.test_springboot.infra.mapper;


import com.example.test_springboot.domain.entity.Achievement;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AchievementMapper {

    void addStuScore(Achievement achievement);
}
