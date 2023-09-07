package com.example.test_springboot.domain.entity.student;

import com.example.test_springboot.domain.entity.Achievement;
import com.example.test_springboot.domain.entity.Course;
import com.example.test_springboot.domain.entity.Student;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class StudentTranscript {
    private Student student;
    private Course course;
    private Achievement achievement;
}
