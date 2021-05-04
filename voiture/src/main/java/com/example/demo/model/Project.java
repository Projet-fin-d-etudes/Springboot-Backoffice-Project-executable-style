package com.example.demo.model;

import javax.annotation.Generated;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="project")
public class Project {
 @Transient
    public static final String SEQUENCE_NAME = "user_sequence";
@Id

private long id;
private String fondateur;
private String projectName ;
public Project() {
	
}
public Project(long id, String fondateur, String projectName) {

	this.id = id;
	this.fondateur= fondateur;
	this.projectName = projectName;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFondateur() {
	return fondateur;
}
public void setFondateur(String fondateur) {
	this.fondateur = fondateur;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
@Override
public String toString() {
	return "Project [id=" + id + ", fondateur=" + fondateur + ", projectName=" + projectName + "]";
}

}
