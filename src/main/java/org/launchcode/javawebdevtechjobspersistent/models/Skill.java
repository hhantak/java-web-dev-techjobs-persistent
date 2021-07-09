package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description is too long!")
    private String jobDescription;

    // no-arg constructor
    public Skill () {}

    @ManyToMany(mappedBy = "skills")

    //getter and setter for jobDescription
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}