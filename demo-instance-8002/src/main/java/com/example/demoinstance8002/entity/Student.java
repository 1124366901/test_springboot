package com.example.demoinstance8002.entity;


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

    private static final long serialVersionUID = 1L;
}
