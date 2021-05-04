package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Project;

public interface ProjectService {

	List<Project> getAllProjects();
    /*List < Voiture > getAllVoitures();
    void saveVoiture(Voiture voiture);
    Voiture getVoitureById(long id);
    void deleteVoitureById(long id);
    void updateVoiture(Voiture voiture);*/

	void saveProject(Project project);

	Project getProjectById(long id);

	void updateProject(Project project);

	void deleteProjectById(long id);
}