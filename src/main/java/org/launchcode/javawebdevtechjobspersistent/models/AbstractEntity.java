package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


@MappedSuperclass // Part 2, task 1
public abstract class AbstractEntity {
    // AUTO generates unique ID for new Employer, Job, and Skills objects Part 2, task 2
    @Id
    @GeneratedValue
    private int id;

    // Requires a name for each object Employer, Job, and Skills - 3-60 characters. Part 2, task 3
    @Size(min = 3, max = 60, message = "Name must be between 3 and 60 characters.")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}