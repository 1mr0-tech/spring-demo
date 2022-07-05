package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
            new Topic("Spring","Example","Desc one"),
            new Topic("Spring1","Example1","Desc two"),
            new Topic("Spring2","Example2","Desc three")
        );
    }
    
}
