package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.model.Project;
import com.example.demo.service.SequenceGeneratorService;
import com.example.demo.service.ProjectService;


@Controller
public class ProjectController {

    

	private static final String SEQUENCE_NAME = null;

	@Autowired
    private ProjectService projectService;

    @Autowired
	private SequenceGeneratorService service;
    @GetMapping("/listp")
    public String viewHomePage(Model model) {
        model.addAttribute("listProject", projectService.getAllProjects());
        return "listp";
    }

    @GetMapping("/showNewProjectForm")
    public String showNewProjectForm(Model model) {
    
        Project project = new Project();
        model.addAttribute("project", project);
        return "new_voiture";
    }

    @PostMapping("/saveProject")
    public String saveProject(@ModelAttribute("project") Project project) {
    	//generate sequence
    	project.setId(service.getSequenceNumber(SEQUENCE_NAME));
       projectService.saveProject(project);
        return "redirect:/listp";
    }
    
    @PostMapping("/updateProject")
    public String updateProject(@ModelAttribute("project") Project project) {
      
       projectService.updateProject(project);
        return "redirect:/listp";
    }

    @GetMapping("/showFormForUpdateProject/{id}")
    public String showFormForUpdateProject(@PathVariable(value = "id") long id, Model model) {

     
       Project project = projectService.getProjectById(id);

      
        model.addAttribute("project", project);
        return "update_voiture";
    }

    @GetMapping("/deleteProject/{id}")
    public String deleteProject(@PathVariable(value = "id") long id) {

       
        this.projectService.deleteProjectById(id);
        return "redirect:/listp";
    }
}