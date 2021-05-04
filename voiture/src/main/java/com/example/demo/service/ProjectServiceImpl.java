package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;


@Service
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List < Project > getAllProjects() {
       List<Project>allProjects = projectRepository.findAll();
       return allProjects;
    }

    @Override
    public void saveProject(Project project) {
    	
    	  
        this.projectRepository.save(project);
    }

    @Override
    public Project getProjectById(long id) {
        Optional < Project > optional = projectRepository.findById(id);
        Project project = null;
        if (optional.isPresent()) {
            project = optional.get();
        } else {
            throw new RuntimeException(" project not found for id :: " + id);
        }
        return project;
    }
    @Override
	public void updateProject(Project project) {
		// TODO Auto-generated method stub
		 this.projectRepository.save(project);
	}

    @Override
    public void deleteProjectById(long id) {
        this.projectRepository.deleteById(id);
    }


	

}
