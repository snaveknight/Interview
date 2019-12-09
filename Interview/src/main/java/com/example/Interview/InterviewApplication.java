package com.example.Interview;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class InterviewApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(InterviewApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {

		// Data prop any tables and data you want loaded into H2 here.

		//runs sql to prepopulate the date on the home page
//		log.info("Creating Employee table");
//		jdbcTemplate.execute("DROP TABLE employees IF EXISTS");
//		jdbcTemplate.execute("CREATE TABLE employees(id VARCHAR, name VARCHAR(20))");
//		jdbcTemplate.execute("INSERT INTO employees (id, name) VALUES('1', 'Bernie Sanders')");
//		jdbcTemplate.execute("INSERT INTO employees (id, name) VALUES('2', 'Jack Wilis')");
//		jdbcTemplate.execute("INSERT INTO employees (id, name) VALUES('3', 'Dave Smith')");
//		jdbcTemplate.execute("INSERT INTO employees (id, name) VALUES('4', 'Blake Trevor')");

	}
}


