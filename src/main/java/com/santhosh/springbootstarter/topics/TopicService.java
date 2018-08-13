package com.santhosh.springbootstarter.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRespository topicRespository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("", "Spring", "IEWL456F"),
            new Topic("", "Corejava", "ILVD456F"),
            new Topic("", "DataStructures", "IGCR456F"),
            new Topic("", "JavaScript", "IHFD456F")
    ));

    public List<Topic> getTopics(){
        List<Topic> topicsList = new ArrayList<>();
        topicRespository.findAll().forEach(topicsList::add);
        return topicsList;
    }

    public Topic getTopic(String id){
        return topicRespository.findOne(id);
    }

    public void addTopic(Topic topic) {

        topicRespository.save(topic);
    }

    public void updateTopic(String name, Topic topic) {

    }

    public void deleteTopic(String name) {
        topicRespository.delete(name);
    }
}
