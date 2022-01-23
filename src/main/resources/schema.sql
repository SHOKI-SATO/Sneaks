CREATE TABLE IF NOT EXISTS m_user (
id SERIAL
	, name VARCHAR(50)
	, email VARCHAR(50) PRIMARY KEY
	, password VARCHAR(100)
	, birthday DATE
	, sex INT
	, phone_number CHAR(11)
);

CREATE TABLE  product_table (
	product_id INT(11) AUTO_INCREMENT PRIMARY KEY
	, product_name VARCHAR(100)
	, product_brand VARCHAR(50)
	, product_value INT(11)
	, product_imege1 VARCHAR
	, product_imege2 VARCHAR
	, product_imege3 VARCHAR
);