CREATE SCHEMA hexagon;

CREATE TABLE hexagon.positions
(
	pos_id INT AUTO_INCREMENT PRIMARY KEY,
	pos_name VARCHAR(250) NOT NULL,
	manager_flag BOOLEAN NOT NULL	
);

CREATE TABLE hexagon.employees
(
	emp_id INT AUTO_INCREMENT PRIMARY KEY,
	pos_id INT NOT NULL,
	full_name VARCHAR(250) NOT NULL,
	date_hired DATE NOT NULL 
);

ALTER TABLE hexagon.employees ADD FOREIGN KEY (pos_id) REFERENCES hexagon.positions(pos_id);
CREATE INDEX emp_id on hexagon.employees(emp_id);