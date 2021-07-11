package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

//Part 2, Models task 4
@Entity
public class Skill extends AbstractEntity {

    //Part 2, Models task 3
    @NotBlank
    @Size(max = 500, message = "Description is too long!")
    private String description;

    // no-arg constructor Part 2, Models task 4
    public Skill () {}

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    //getter and setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setSkills(List<Job> jobs) {
        this.jobs = jobs;
    }
}