USE Movie;
CREATE TABLE movie(
idPhim varchar(100) not null primary key,
tieuDe varchar(100) not null,
namPhatHanh int not null
);

// liệt kê
DELIMITER $$
CREATE PROCEDURE list_movies()
BEGIN
SELECT*FROM movie;
END $$
DELIMITER ;

// thêm phim
DELIMITER $$
CREATE PROCEDURE add_movie(
IN in_idPhim varchar(100),
IN in_tieuDe varchar(100),
IN in_namPhatHanh date
) 
BEGIN
	INSERT INTO movie(idPhim,tieuDe,namPhatHanh)
    VALUE(in_idPhim,in_tieuDe,in_namPhatHanh);
END $$
DELIMITER ;

// sửa phim
DELIMITER $$
CREATE PROCEDURE update_movies(
IN in_idPhim varchar(100),
IN in_tieuDe varchar(100),
IN in_namPhatHanh date
)
BEGIN
  UPDATE movie
  SET tieuDe = in_tieuDe,
		namPhatHanh = in_namPhatHanh
  WHERE idPhim = in_idPhim;      
END $$
DELIMITER ;

// xóa phim
DELIMITER $$
CREATE PROCEDURE del_movie(
IN in_id_del varchar(100)
)
BEGIN
	DELETE FROM movie
    WHERE idPhim = in_id_del;
END $$
DELIMITER ;

