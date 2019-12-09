/* This is employee dummy data */
insert into employee (employee_id, first_name, last_name, company_email, birth_date, hire_date, role) values ('d7d462a4-2ada-4596-b0a4-93c4a450df82', 'Gina', 'Crocumbe', 'gcrocumbe0@examiner.com', TO_DATE('10-Apr-2000'), TO_DATE('18-Dec-2018'), 'Recruiter');
insert into employee (employee_id, first_name, last_name, company_email, birth_date, hire_date, role) values ('394fab8d-b8a4-45af-b786-88baf41be66b', 'Jewel', 'Pyrton', 'jpyrton1@webs.com', TO_DATE('21-Nov-1967'), TO_DATE('9-Sep-2017'), 'Food Chemist');
insert into employee (employee_id, first_name, last_name, company_email, birth_date, hire_date, role) values ('ca55349e-880e-486a-b3dc-4177f6a5843f', 'Tansy', 'Cottingham', 'tcottingham2@arizona.edu', TO_DATE('13-Feb-1972'), TO_DATE('10-Jan-2016'), 'Biostatistician III');
insert into employee (employee_id, first_name, last_name, company_email, birth_date, hire_date, role) values ('3f3b36e1-5479-4e4d-a504-f09d05b8416f', 'Faith', 'MacCawley', 'fmaccawley3@telegraph.co.uk', TO_DATE('16-Oct-1982'), TO_DATE('24-Aug-2007'), 'Account Executive');
insert into employee (employee_id, first_name, last_name, company_email, birth_date, hire_date, role) values ('6ddb3879-edca-4c09-9c1c-c6b82096a20a', 'Minette', 'Yezafovich', 'myezafovich4@uol.com.br', TO_DATE('7-Jun-1970'), TO_DATE('4-Jan-2009'), 'Help Desk Technician');

/*This is adress dummy data*/
insert into address (address_id, street, city, region, postal, country) values ('c45db953-da3c-42d5-afd6-bc1da6ffc7c4', '676 Village Green Circle', 'Miami', 'Florida', '33261', 'US');
insert into address (address_id, street, city, region, postal, country) values ('ebbbeb9d-a68b-4746-a90d-c40d211b5ae5', '293 Mariners Cove Center', 'Fort Smith', 'Arkansas', '72916', 'US');
insert into address (address_id, street, city, region, postal, country) values ('51a267fb-37fb-4c34-ad42-21bf24c7dc13', '59344 Ramsey Avenue', 'Akron', 'Ohio', '44305', 'US');
insert into address (address_id, street, city, region, postal, country) values ('e636d402-5f5e-42d4-babb-30c99c27e44c', '7 Gerald Place', 'Phoenix', 'Arizona', '85067', 'US');
insert into address (address_id, street, city, region, postal, country) values ('fd9b6e26-1f01-4a79-87b3-8d72b2b410c3', '839 Warrior Point', 'Waco', 'Texas', '76711', 'US');

/*This is employee_address dummy data*/
insert into employee_address VALUES ('d7d462a4-2ada-4596-b0a4-93c4a450df82', 'c45db953-da3c-42d5-afd6-bc1da6ffc7c4');
insert into employee_address VALUES ('394fab8d-b8a4-45af-b786-88baf41be66b', 'ebbbeb9d-a68b-4746-a90d-c40d211b5ae5');
insert into employee_address VALUES ('ca55349e-880e-486a-b3dc-4177f6a5843f', '51a267fb-37fb-4c34-ad42-21bf24c7dc13');
insert into employee_address VALUES ('3f3b36e1-5479-4e4d-a504-f09d05b8416f', 'e636d402-5f5e-42d4-babb-30c99c27e44c');
insert into employee_address VALUES ('6ddb3879-edca-4c09-9c1c-c6b82096a20a', 'fd9b6e26-1f01-4a79-87b3-8d72b2b410c3');

/*This is skill dummy data*/
insert into skill (skill_id, experience) values ('983b78bc-34e9-410d-b3b0-1360e9526066', 4);
insert into skill (skill_id, experience) values ('1d6b74c4-0c5a-45ba-8e6c-51a82464257f', 3);
insert into skill (skill_id, experience) values ('01d63251-8155-437f-926a-d429c193f1e9', 7);
insert into skill (skill_id, experience) values ('7466e959-c03b-4b98-8009-00c3f807f9d5', 18);
insert into skill (skill_id, experience) values ('08c0e707-accb-4368-8969-230ff5c0f828', 10);

/*This is employee_skill dummy data*/
insert into employee_skill values ('d7d462a4-2ada-4596-b0a4-93c4a450df82' , '983b78bc-34e9-410d-b3b0-1360e9526066');
insert into employee_skill values ('d7d462a4-2ada-4596-b0a4-93c4a450df82' , '7466e959-c03b-4b98-8009-00c3f807f9d5');
insert into employee_skill values ('394fab8d-b8a4-45af-b786-88baf41be66b', '1d6b74c4-0c5a-45ba-8e6c-51a82464257f');
insert into employee_skill values ('ca55349e-880e-486a-b3dc-4177f6a5843f', '01d63251-8155-437f-926a-d429c193f1e9');
insert into employee_skill values ('3f3b36e1-5479-4e4d-a504-f09d05b8416f', '7466e959-c03b-4b98-8009-00c3f807f9d5');
insert into employee_skill values ('6ddb3879-edca-4c09-9c1c-c6b82096a20a', '08c0e707-accb-4368-8969-230ff5c0f828');

/*This is the field dummy data*/
insert into field (field_id, name, type) values ('3413fcab-773d-41ff-9238-c900fe695a01', 'Litigation', 'Irrigation Management');
insert into field (field_id, name, type) values ('f9ffd88a-a1c3-468f-a19b-e5b370efb5ce', 'EViews', 'Prototype.js');
insert into field (field_id, name, type) values ('a3cd73c1-8593-4e80-b052-9b773ebd81d2', 'QC Tools', 'ICH-GCP');
insert into field (field_id, name, type) values ('0c098050-c408-4412-8a89-63ea1e5450bf', 'LDP', 'VO');
insert into field (field_id, name, type) values ('a775fa3c-7616-4532-8ba3-9c3021b86584', 'MVA', 'ODC');

/*This is the field_skill*/
insert into field_skill values ('3413fcab-773d-41ff-9238-c900fe695a01', '983b78bc-34e9-410d-b3b0-1360e9526066');
insert into field_skill values ('f9ffd88a-a1c3-468f-a19b-e5b370efb5ce', '1d6b74c4-0c5a-45ba-8e6c-51a82464257f');
insert into field_skill values ('a3cd73c1-8593-4e80-b052-9b773ebd81d2', '01d63251-8155-437f-926a-d429c193f1e9');
insert into field_skill values ('0c098050-c408-4412-8a89-63ea1e5450bf', '7466e959-c03b-4b98-8009-00c3f807f9d5');
insert into field_skill values ('a775fa3c-7616-4532-8ba3-9c3021b86584', '08c0e707-accb-4368-8969-230ff5c0f828');




