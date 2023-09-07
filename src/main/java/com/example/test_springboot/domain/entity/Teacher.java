package com.example.test_springboot.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Teacher {

    private Integer id;

    private String name;

    private String sex;

    private Integer age;

}
