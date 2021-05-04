package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Project;

@Repository 
public interface ProjectRepository extends MongoRepository< Project , Long > {   

}