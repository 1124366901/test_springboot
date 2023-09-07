package com.example.test_springboot.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Course {

    private Integer id;

    private String title;

    private Integer tid;


}
