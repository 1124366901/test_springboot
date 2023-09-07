package com.example.test_springboot.controller;

import com.example.test_springboot.api.service.impl.ExampleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("TestController")
public class TestController {

    public static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    public ExampleServiceImpl exampleService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Word!";
    }

    @RequestMapping("/hello/getName")
    public String getName(){
        logger.info("getNameHuTao");
        return  exampleService.getCustomerType()+exampleService.getCustomer();
    }

    @GetMapping("/GetId")
    public String GetTest(@RequestParam("id") int id){
        return String.valueOf(id*100);
    }

    @PostMapping("/PostTest")
    public String PostTest(@RequestParam("name") String name,@RequestParam("sex") String sex,@RequestParam("age") int age){
        return name+","+sex+"性,"+age+"周岁";
    }

    @PutMapping("/PutTest")
    public String PutTest(@RequestBody Map<String, Object> params){
        int age = Integer.valueOf((String) params.get("age"));
        if (age>=18){
            params.put("mark","已成年");
        }else {
            params.put("mark","未成年");
        }
        return params.toString();
    }
    @DeleteMapping("/DeleteTest")
    public String DeleteTest(@RequestParam(value = "name",required = false) String name,
                             @RequestParam(value = "sex",required = false) String sex,
                             @RequestParam(value = "age",required = false) String age){
        return name+"信息已经删除!!!!";
    }


}
