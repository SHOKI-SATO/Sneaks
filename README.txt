/* ユーザーテーブル */
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

/* 商品テーブル */
CREATE TABLE  product_table (
	product_id SERIAL PRIMARY KEY
	, product_name VARCHAR(100)
	, brand VARCHAR(50)
	, price VARCHAR(11)
	, color VARCHAR(50)
	, product_image1 VARCHAR(100)
	, product_image2 VARCHAR(100)
	, product_image3 VARCHAR(100)
);

INSERT INTO  product_table
 (product_name, brand, price, color, product_image1, product_image2, product_image3)
VALUES
/* 1 */
 ('STAN SMITH', 'adidas', '7777', 'Green', '/images/adidas_stansmith.jpg', 'images/adidas_stansmith_s.jpg', '/images/adidas_stansmith_b.jpg'),
 /* 2 */
 ('STAN SMITH', 'adidas', '7777', 'Green', '/images/adidas_stansmith_tricolore.jpg', '/images/adidas_stansmith_tricolore_s.jpg', '/images/adidas_stansmith_tricolore_b.jpg'),
 /* 3 */
 ('STAN SMITH', 'adidas', '7777', 'kermit', '/images/adidas_stansmith_navyrightblue.jpg', '/images/adidas_stansmith_navyrightblue_s.jpg', '/images/adidas_stansmith_tricolore_b.jpg'),
 /* 4 */
 ('STAN SMITH', 'adidas', '7777', 'Navy/Lightblue', '/images/adidas_stansmith_kermit.jpg', '/images/adidas_stansmith_kermit_s.jpg', '/images/adidas_stansmith_kermit_b.jpg'),
 /* 5 */
 ('STAN SMITH', 'adidas', '7777', 'White/CreamWhite/BlueBird', '/images/adidas_stansmith_footwearwhitecreamwhitebluebird.jpg', '/images/adidas_stansmith_footwearwhitecreamwhitebluebird_s.jpg', '/images/adidas_stansmith_footwearwhitecreamwhitebluebird_b.jpg'),
 /* 6 */
 ('STAN SMITH', 'adidas', '7777', 'White/CrystalWhite/TeamRoyalBlue', '/images/adidas_stansmith_footwearcrystalwhiteteamroyalblue.jpg', '/images/adidas_stansmith_footwearcrystalwhiteteamroyalblue_s.jpg', '/images/adidas_stansmith_footwearcrystalwhiteteamroyalblue_b.jpg'),
 /* 7 */
 ('STAN SMITH', 'adidas', '7777', 'Black/White/TeamRoyalBlue', '/images/adidas_stansmith_coreblackcrystalwhiteteamroyalblue.jpg', '/images/adidas_stansmith_coreblackcrystalwhiteteamroyalblue_s.jpg', '/images/adidas_stansmith_coreblackcrystalwhiteteamroyalblue_b.jpg'),
 /* 8 */
 ('SUPER STAR', 'adidas', '7777','Black', '/images/adidas_supersuter.jpg', '/images/adidas_supersuter_s.jpg', '/images/adidas_supersuter_b.jpg'),
 /* 9 */
 ('AirForce1 Fontaka', 'Nike', '7777', 'ArcheoPink', '/images/nike_airforce1fontaka.jpg', '/images/nike_airforce1fontaka_s.jpg', '/images/nike_airforce1fontaka_b.jpg'),
 /* 10 */
 ('AirForce1 Pixel', 'Nike', '7777', 'White', '/images/nike_airforce1pixel.jpg', '/images/nike_airforce1pixel_s.png', '/images/nike_airforce1pixel_b.png') 
 /* 上記まで修正済み(実行可) */
 
 /* 下記より未修正(実行不可) */
 /* 11 */
 (‘AirJodan1 Mid（WolfGrey）’, ’Nike’, 7777, ‘/images/nike_airjordan1mid_wolfgrey.jpg’, ‘/images/nike_airjordan1mid_wolfgrey_s.jpg’, ‘/images/nike_airjordan1mid_wolfgrey_b.jpg’),
 /* 12 */
 (‘AirMax PRE-DAY（PurpleDawn）’, ’Nike’, 7777, ‘/images/nike_airmaxpreday.jpg’, ‘/images/nike_airmaxpreday_s.jpg’, ‘/images/nike_airmaxpreday_b.jpg’),
 /* 13 */
 (‘AirZoom Pegasus（IndigoHaze/BrightMango）’, ’Nike’, 7777, ‘/images/nike_airzoompegasus37.jpg’, ‘/images/nike_airzoompegasus37_s.jpg’, ‘/images/nike_airzoompegasus37_b.jpg’),
 /* 14 */
 (‘ReactInfinity Run Flyknit2（PinkGraze）’, ’Nike’, 7777, ‘/images/nike_reactinfinityrunflyknit2.jpg’, ‘/images/nike_reactinfinityrunflyknit2_s.jpg’, ‘/images/nike_reactinfinityrunflyknit2_b.jpg’),
 /* 15 */
 (‘RYZ365 2（White/White）’, ’Nike’, 7777, ‘/images/nike_ryz3652.jpg’, ‘/images/nike_ryz3652_b.jpg’, ‘/images/nike_ryz3652_s.jpg’),
 /* 16 */
 (‘ZoomX Vaporfly Next%2（BarelyVolt/Turquoise）’, ’Nike’, 7777, ‘/images/nike_zoomxvaporflynext.jpg’, ‘/images/nike_zoomxvaporflynext_s.jpg’, ‘/images/nike_zoomxvaporflynext_b.jpg’),
 /* 17 */
 (‘NIKE×SACAI LDVWAFFLE（White）’, ’Nike’, 7777, ‘/images/sacaixnike_ldvwaffle_triplewhite.jpg’, ‘/images/sacaixnike_ldvwaffle_triplewhite (1).jpg’, ‘/images/sacaixnike_ldvwaffle_triplewhite_b.jpg’),
 /* 18 */
 (‘AUTHENTIC（Black）’, ’VANS’, 7777, ‘/images/vans_authentic_black.jpg’, ‘/images/vans_authentic_black_s.jpg’, ‘/images/vans_authentic_black_b.jpg’),
 /* 19 */
 (‘AUTHENTIC（Red）’, ’VANS’, 7777, ‘/images/vans_authentic_red.jpg’, ‘/images/vans_authentic_red_s.jpg’, ‘/images/vans_authentic_red_b.jpg’),
 /* 20 */
 (‘AUTHENTIC（White）’, ’VANS’, 7777, ‘/images/vans_authentic_white.jpg’, ‘/images/vans_authentic_white_s.jpg’, ‘/images/vans_authentic_white_b.jpg’),
 /* 21 */
 (‘CANVAS ALL STAR COLORS HI（White/Black）’, ’Converse’, 7777, ‘/images/converse_allstar.jpg’, ‘/images/converse_allstar_s.jpg’, ‘/images/converse_allstar_b.jpg’),
 /* 22 */
 (‘Reebok×atmos INSTAPUMP FURY（CitronAnimal）’, ’Reebok’, 7777, ‘/images/reebokxatmos_instapunpfury_citronanimal.jpg’, ‘/images/reebokxatmos_instapunpfurycitronanimal_s.jpg’, ‘/images/reebokxatmos_instapunpfury_citronanimal_b.jpg’),
 /* 23 */
 (‘CM996 WR2（Black）’, ’New Balance’, 7777, ‘/images/newbalance_cm996wr2.jpg’, ‘/images/newbalance_cm996wr2_s.jpg’, ‘/images/newbalance_cm996wr2_b.jpg’),
 /* 24 */
 (‘Jewery（WhiteGray/IceGray）’, ’grounds, 7777, ‘/images/grounds_jewery.jpg’, ‘/images/grounds_jewery_s.jpg’, ‘/images/grounds_jewery_b.jpg’);
