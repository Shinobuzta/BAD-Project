package com.springapp.entities;
import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Angela
 * Date: 12/6/13
 * Time: 10:53 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name="charitiesProject")
public class CharitiesProject {
    @Basic
     private String projectName;
    @Basic
     private String projectDetails;
    @Basic
     private Double projectBudgetNeed;

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
        return projectBudgetNeed;
    }

    public void setProjectBudgetNeed(Double projectBudgetNeed) {
        this.projectBudgetNeed = projectBudgetNeed;
    }




}
