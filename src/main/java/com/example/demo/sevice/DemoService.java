package com.example.demo.sevice;

import com.example.demo.dao.DemoMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final DemoMapper demoMapper;

    @Autowired
    public DemoService(DemoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }

    public User test() {
        return demoMapper.test();
    }
}
