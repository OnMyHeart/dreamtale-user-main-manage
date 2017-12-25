package com.dreamtale.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {
    
    @Autowired
    MongoTemplate mongoTemplate;

    public void register(){

    }

}
