package com.example.FirstProj.service;

import com.example.FirstProj.model.Topic;
import com.example.FirstProj.model.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        ArrayList<Topic> topicList = new ArrayList<>();
        topicRepository.findAll().forEach(topicList::add);
        return topicList;
    }

    public Optional<Topic> getTopic(int id){
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(int id){
        topicRepository.deleteById(id);
    }
}
