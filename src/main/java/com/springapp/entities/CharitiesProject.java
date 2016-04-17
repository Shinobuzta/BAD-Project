package com.springapp.entities;
import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Angela
 * Date: 12/6/13
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="project")
public class CharitiesProject {
    @Id
    @GeneratedValue
    private Integer id;

    @Basic
     private String projectName;
    @Basic
     private String projectDetails;
    @Basic
     private Double projectBudgetNeeded;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public Double getProjectBudgetNeed() {
        return projectBudgetNeeded;
    }

    public void setProjectBudgetNeed(Double projectBudgetNeed) {
        this.projectBudgetNeeded = projectBudgetNeed;
    }

    public void nonSense(){
    	//added to practice git
    	int nonsense = 0;
    	String nonsense2 = "";
        boolean nonesense3 = false;
        boolean nonsense4 = true;
    }
}
