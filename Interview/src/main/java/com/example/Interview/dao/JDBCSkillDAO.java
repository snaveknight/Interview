package com.example.Interview.dao;

import com.example.Interview.model.Skill;
import org.h2.jdbcx.JdbcDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCSkillDAO implements SkillDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCSkillDAO() {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:mem:testdb");
        dataSource.setUser("sa");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public List<Skill> getAllSkillsByEmployeeId(String employeeId) {
        List<Skill> skillList = new ArrayList<>();
        SqlRowSet sqlResults = jdbcTemplate.queryForRowSet("SELECT e.employee_id,e.last_name, s.skill_id, s.experience,f.name, f.type\n" +
                "                FROM employee e\n" +
                "                INNER JOIN employee_skill es\n" +
                "                ON e.employee_id = es.employee_id\n" +
                "                inner join skill s\n" +
                "                on es.skill_id = s.skill_id\n" +
                "                inner join field_skill fs\n" +
                "                on fs.skill_id = s.skill_id\n" +
                "                inner join field f\n" +
                "                on f.field_id = fs.field_id\n" +
                "                where e.employee_id = ?", employeeId);

        while (sqlResults.next()) {
            Skill skill = new Skill();
            skill.setSkillId(sqlResults.getString("skill_id"));
            skill.setExperience(sqlResults.getInt("experience"));
            skill.setFieldName(sqlResults.getString("name"));
            skill.setType(sqlResults.getString("type"));
            skillList.add(skill);
        }

        return skillList;
    }

    @Override
    public Skill addSkillToEmployee(String fieldId, String employeeId){
        System.out.println(fieldId);
    String sqlThisSkill = "Select skill_id \n" +
            "FROM field_skill\n" +
            "Where field_id = ?";
     SqlRowSet sqlResults = jdbcTemplate.queryForRowSet(sqlThisSkill, fieldId);
    String skillId = sqlResults.getString("skill_id");
    String sqlField = "Insert Into employee_skill (employee_id, skill_id) values (?,?)";
    jdbcTemplate.update(sqlField, employeeId, skillId);
        return null;
    }
}


