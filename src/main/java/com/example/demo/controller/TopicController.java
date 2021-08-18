package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
 @RequestMapping("/topics")
 public List<Topic> getAllTopics()
 {
	return topicservice.getAllTopics();
	
 }
 @RequestMapping(method=RequestMethod.POST,value= "/addTopic")
 public void addTopic(@RequestBody Topic tp) {
	 topicservice.addTopic(tp);
	 
 }

}
