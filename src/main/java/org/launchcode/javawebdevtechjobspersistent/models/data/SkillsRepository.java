package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// on line 8 might need to change String to Integer so it sorts by ID... have to test.
@Repository
public interface SkillsRepository extends CrudRepository<Skill, Integer> {


}