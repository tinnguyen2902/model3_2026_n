USE Model3;
CREATE TABLE Students (
student_id INT auto_increment primary key,
full_name varchar(100) not null,
date_of_birth DATE NOT NULL,
email varchar(100) not null unique
);

-- lấy all các sv
DELIMITER $$
CREATE PROCEDURE get_all_students()
BEGIN
SELECT*FROM Students;
END $$
DELIMITER ;

-- thêm mới sv 
DELIMITER $$
CREATE PROCEDURE add_student(
IN in_full_name VARCHAR(100),
IN in_date_of_birth DATE,
IN in_email  VARCHAR(100)
)
BEGIN
	INSERT INTO Students(full_name,date_of_birth,email)
    VALUES(in_full_name,in_date_of_birth,in_email);
END$$
DELIMITER ;

-- cập nhật thông tin
DELIMITER $$
CREATE PROCEDURE update_student (
IN in_id INT,
IN in_full_name VARCHAR(100),
IN in_date_of_birth DATE,
IN in_email VARCHAR(100)
)
BEGIN
 UPDATE Students
 SET full_name = in_full_name,
 date_of_birth = in_date_of_birth,
 email = in_email
 WHERE student_id = in_id;
END $$
DELIMITER ;

-- lấy sv theo id
DELIMITER $$
CREATE PROCEDURE find_student_by_id(
IN in_id int
)
BEGIN
	SELECT*FROM Students
    WHERE student_id = in_id;
END$$
DELIMITER ;

-- xóa theo id
DELIMITER $$
CREATE PROCEDURE delete_student (
IN in_id int
) 
BEGIN
	DELETE FROM Students
    WHERE student_id = in_id;
END$$
DELIMITER ;
--  check
CALL get_all_students();
CALL find_student_by_id(1);
CALL update_student(1, 'Nguyen Van C', '2000-01-01', 'vanc@gmail.com');
CALL delete_student(2);