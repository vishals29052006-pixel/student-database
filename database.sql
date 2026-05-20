CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    year INT,
    phone VARCHAR(15)
);
