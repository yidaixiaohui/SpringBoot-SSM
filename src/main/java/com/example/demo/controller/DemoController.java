package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.sevice.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @RequestMapping(value = "/test")
    public User getShufflingImg(){
        return demoService.test();
    }
}
