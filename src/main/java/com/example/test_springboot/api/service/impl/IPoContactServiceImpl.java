package com.example.test_springboot.api.service.impl;

import com.example.test_springboot.api.service.IPoContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IPoContactServiceImpl implements IPoContactService {

//    @Autowired
//    private IPoContactRepository poContactRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getInstanceInfo(Long contactId) {

        return null;
    }
}
