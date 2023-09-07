package com.example.test_springboot.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Achievement {

    private Integer id;

    private Integer sid;

    private Integer cid;

    private Integer score;

    public Achievement(Integer sid, Integer cid, Integer score) {
        this.sid = sid;
        this.cid = cid;
        this.score = score;
    }
}
