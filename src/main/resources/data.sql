INSERT INTO hexagon.positions (pos_name, manager_flag) VALUES
('Human Resources Director', '1');

INSERT INTO hexagon.positions (pos_name, manager_flag) VALUES
('Quality Control Tester', '0');

INSERT INTO hexagon.positions (pos_name, manager_flag) VALUES
('DevOps Engineer', '1');

INSERT INTO hexagon.employees (pos_id, full_name, date_hired) VALUES
((SELECT pos_id from hexagon.positions WHERE pos_name = 'Human Resources Director'), 'Linda Carter', TO_DATE('2005-04-15', 'YYYY-MM-DD'));

INSERT INTO hexagon.employees (pos_id, full_name, date_hired) VALUES
((SELECT pos_id from hexagon.positions WHERE pos_name = 'Quality Control Tester'), 'Ariana Grande', TO_DATE('2018-05-01', 'YYYY-MM-DD'));

INSERT INTO hexagon.employees (pos_id, full_name, date_hired) VALUES
((SELECT pos_id from hexagon.positions WHERE pos_name = 'DevOps Engineer'), 'Clint Eastwood', TO_DATE('2014-05-19', 'YYYY-MM-DD'));

INSERT INTO hexagon.employees (pos_id, full_name, date_hired) VALUES
((SELECT pos_id from hexagon.positions WHERE pos_name = 'Quality Control Tester'), 'Ann Margaret', TO_DATE('2010-07-22', 'YYYY-MM-DD'));

INSERT INTO hexagon.employees (pos_id, full_name, date_hired) VALUES
((SELECT pos_id from hexagon.positions WHERE pos_name = 'Quality Control Tester'), 'Debbie Gibson', TO_DATE('2020-11-16', 'YYYY-MM-DD'));