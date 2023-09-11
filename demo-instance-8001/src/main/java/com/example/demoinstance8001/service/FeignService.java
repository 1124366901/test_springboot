package com.example.demoinstance8001.service;



import com.example.demoinstance8001.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient(value = "MICROSERVICECLOUDPROVIDERDEPT")
public interface FeignService {

    @RequestMapping(value = "/stu/all", method = RequestMethod.GET)
    List<Student> getAll();

}
