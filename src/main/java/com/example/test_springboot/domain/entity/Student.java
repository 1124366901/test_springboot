package com.example.test_springboot.domain.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable {

    private Integer id;

    private String name;

    private String sex;

    private Integer age;
}
