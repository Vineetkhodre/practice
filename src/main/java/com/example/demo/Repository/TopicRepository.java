package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{

}
