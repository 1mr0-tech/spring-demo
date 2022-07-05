package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService{

    private List<Topic> topics= Arrays.asList(
        new Topic("Spring","Example","Desc one"),
        new Topic("Spring1","Example1","Desc two"),
        new Topic("Spring2","Example2","Desc three")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }
}