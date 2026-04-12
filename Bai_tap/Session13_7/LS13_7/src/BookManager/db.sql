USE MD3_LS7_Book;
CREATE TABLE Book(
                     bookId INT PRIMARY KEY AUTO_INCREMENT,
                     title varchar(255) not null,
                     author varchar(255) not null,
                     published_year year not null,
                     price decimal(10,2) not null
);
SELECT*FROM Book;