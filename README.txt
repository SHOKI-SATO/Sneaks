CREATE TABLE IF NOT EXISTS m_user (
	user_id VARCHAR(50) PRIMARY KEY
	, name VARCHAR(50)
	, password VARCHAR(100)
	, birthday DATE
	, sex INT
	, phone_number CHAR(11)
	, post_code CHAR(7)
	, address VARCHAR(100)
	, role CHAR(4)
);

INSERT INTO m_user (
	user_id,
	name,
	password,
	birthday,
	sex,
	phone_number,
	post_code,
	address,
	role
)
values(
	'test@email.com',
	'Tom',
	'$2a$10$/Hr9m1n3tDABNJJPCGNEm.XNIkDBpQ5sZs10oLgKSkV9Y88Mo7ZL6',
	'1980/01/01',
	1,
	'09012345678',
	1048404,
	'東京都中央区築地一丁目1番1号',
	'user'
);