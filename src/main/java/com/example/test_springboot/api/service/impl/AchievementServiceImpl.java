package com.example.test_springboot.api.service.impl;

import com.example.test_springboot.api.service.AchievementService;
import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.infra.mapper.AchievementMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AchievementServiceImpl implements AchievementService {


    @Resource
    private AchievementMapper achievementMapper;
    @Override
    public void addStuScore(Achievement achievement) {
        achievementMapper.addStuScore(achievement);
    }

    @Override
    public void updateStu(Achievement achievement) {
        achievementMapper.updateStu(achievement);
    }
}
