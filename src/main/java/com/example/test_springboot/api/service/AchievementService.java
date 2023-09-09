package com.example.test_springboot.api.service;

import com.example.test_springboot.domain.entity.Achievement;

public interface AchievementService {

    void addStuScore(Achievement achievement);

    void updateStu(Achievement achievement);
}
