DROP TABLE IF EXISTS address;
CREATE TABLE address(
    address_id VARCHAR(256) NOT NULL, 
    street VARCHAR(256) NOT NULL, 
    city VARCHAR(64) NOT NULL, 
    region VARCHAR(64) NOT NULL, 
    postal VARCHAR(16) NOT NULL, 
    country CHAR(2) NOT NULL,
    CONSTRAINT pk_address_id PRIMARY KEY (address_id)
);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
    employee_id VARCHAR(256) NOT NULL,
    first_name VARCHAR(64) NOT NULL,
    last_name VARCHAR(64) NOT NULL,
    company_email VARCHAR(256) NOT NULL,
    birth_date DATE NOT NULL,
    hire_date DATE NOT NULL,
    role VARCHAR(256) NOT NULL,
    CONSTRAINT pk_employee_id PRIMARY KEY (employee_id)
);

DROP TABLE IF EXISTS employee_address;
CREATE TABLE employee_address (
    employee_id VARCHAR(256) NOT NULL,
    address_id VARCHAR(256) NOT NULL,
    CONSTRAINT fk_employee_address_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
    CONSTRAINT fk_employee_address_address_id FOREIGN KEY (address_id) REFERENCES address(address_id)
);

DROP TABLE IF EXISTS skill;
CREATE TABLE skill (
    skill_id VARCHAR(256) NOT NULL,
    experience integer,
    CONSTRAINT pk_skill_id PRIMARY KEY (skill_id)
);

DROP TABLE IF EXISTS employee_skill;
CREATE TABLE employee_skill (
    employee_id VARCHAR(256) NOT NULL,
    skill_id VARCHAR(256) NOT NULL,
    CONSTRAINT fk_employee_skill_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
    CONSTRAINT fk_employee_skill_skill_id FOREIGN KEY (skill_id) REFERENCES skill(skill_id)
);

DROP TABLE IF EXISTS field;
CREATE TABLE field (
    field_id VARCHAR(256) NOT NULL,
    name VARCHAR(256) NOT NULL,
    type VARCHAR(64) NOT NULL,
    CONSTRAINT pk_field_id PRIMARY KEY (field_id)
);

DROP TABLE IF EXISTS field_skill;
CREATE TABLE field_skill (
    field_id VARCHAR(256) NOT NULL,
    skill_id VARCHAR(256) NOT NULL,
    CONSTRAINT fk_field_skill_field_id FOREIGN KEY (field_id) REFERENCES field(field_id),
    CONSTRAINT fk_skill_field_skill_id FOREIGN KEY (skill_id) REFERENCES skill(skill_id)
);