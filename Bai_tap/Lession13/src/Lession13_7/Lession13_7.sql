USE Lession13_7;
CREATE TABLE book (
id int primary key auto_increment,
title varchar(255) not null,
author varchar(255) not null,
published_year year not null,
price decimal(10,2) not null
);
-- thêm sách
DELIMITER $$
CREATE PROCEDURE addBook (
IN in_id int,
IN in_title varchar(255),
IN in_author varchar(255),
IN in_published_year year,
IN in_price decimal(10,2)
)
BEGIN
  INSERT INTO book(id,title,author,published_year,price)
  VALUE (in_id,in_title,in_author,in_published_year,in_price);
END $$
DELIMITER ;
-- cập nhật
DELIMITER $$
CREATE PROCEDURE update_book (
IN in_id int,
IN in_title varchar(255),
IN in_author varchar(255),
IN in_published_year year,
IN in_price decimal(10,2)
)
BEGIN
	UPDATE book
    SET title = in_title,
		author = in_author,
        published_year = in_published_year,
        price = in_price
    WHERE id = in_id;
END $$
DELIMITER ;
-- xóa
DELIMITER $$
CREATE PROCEDURE deleteBook(
IN in_id int
)
BEGIN
	DELETE FROM book
    WHERE id = in_id;
END $$
DELIMITER ;
-- tìm kiếm
DELIMITER $$
CREATE PROCEDURE findBooksByAuthor(
IN in_author varchar(255)
)
BEGIN
	SELECT*FROM book
    WHERE author LIKE CONCAT('%',in_author,'%');
END $$
DELIMITER ;
-- hiển thị danh sách
DELIMITER $$
CREATE PROCEDURE listAllBooks()
BEGIN
 SELECT*FROM book;
END $$
DELIMITER ;