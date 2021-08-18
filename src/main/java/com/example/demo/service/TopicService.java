package com.example.demo.service;


import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TopicRepository;
import com.example.demo.model.Topic;
@Service
public class TopicService {
	
//	private List<Topic> topics = Arrays.asList(
//			new Topic("101","Java","tutorial"),
//			new Topic("102","React","tutorial"),
//			new Topic("103","Node","tutorial")
//			);
    @Autowired
    private TopicRepository tpr;

	public List <Topic> getAllTopics()
	{
		ArrayList <Topic> topics=new ArrayList<Topic>();
	    tpr.findAll().forEach(topics::add);
		return topics;
		
	}
	
	public void addTopic(Topic obj) {
		tpr.save(obj);
	}
	

}
