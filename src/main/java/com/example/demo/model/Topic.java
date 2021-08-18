package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	private String topic_name;
	@Id
	private String id;
	private String description;
	
	public String getTopic_name() {
		return topic_name;
	}
	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Topic() {
		//super();
	}
	
	public Topic(String topic_name, String id, String description) {
		//super();
		this.topic_name = topic_name;
		this.id = id;
		this.description = description;
	}
	
	
	

}
