package com.example.Interview.dao;

import com.example.Interview.model.Employee;
import com.example.Interview.model.Skill;

import java.util.List;

public interface SkillDao {

    public List<Skill> getAllSkillsByEmployeeId(String employeeId);

    Skill addSkillToEmployee(String fieldId, String employeeId);



}
