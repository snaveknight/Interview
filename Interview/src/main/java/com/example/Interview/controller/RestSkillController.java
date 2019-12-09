package com.example.Interview.controller;


import com.example.Interview.dao.SkillDao;
import com.example.Interview.model.Employee;
import com.example.Interview.model.Skill;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/employees")
public class RestSkillController {

    @Autowired
    private SkillDao skillDao;

    @GetMapping("/{employeeId}/skill")
    public List<Skill> getAllSkillsByEmployeeIdEndPoint(@PathVariable String employeeId) {
        List<Skill> allSkillsByEmployeeId = skillDao.getAllSkillsByEmployeeId(employeeId);
        return allSkillsByEmployeeId;
    }

    @PostMapping("/{employeeId}/skill")
    public void addSkillToEmployee(@RequestBody String updateRequest , @PathVariable String employeeId) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(updateRequest);
        String fieldId = node.get("field").get("id").asText();
        String experience = node.get("experience").asText();
        skillDao.addSkillToEmployee(fieldId, employeeId, experience);
    }
}
