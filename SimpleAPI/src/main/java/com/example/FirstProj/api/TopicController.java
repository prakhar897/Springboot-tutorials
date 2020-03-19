package com.example.FirstProj.api;

import com.example.FirstProj.model.Topic;
import com.example.FirstProj.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topic/{id}")
    public Optional<Topic> getTopic(@PathVariable int id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/topic")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/topic/{id}")
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }
}
