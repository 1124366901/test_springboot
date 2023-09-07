package com.example.test_springboot.api.service.impl;

import com.example.test_springboot.api.service.ExampleService;
import com.example.test_springboot.domain.entity.CustomerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Service
public class ExampleServiceImpl  implements ExampleService {

    @Value("${demo.springboot.customerType}")
    private String customerType;

    @Resource
    private CustomerProperties customerProperties;

    @Override
    public String getCustomerType() {
        return customerType;
    }

    @Override
    public String getCustomer() {
        return customerProperties.toString();
    }


}
