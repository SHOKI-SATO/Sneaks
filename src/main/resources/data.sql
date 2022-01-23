INSERT INTO m_user (
	name,
	email,
	password,
	birthday,
	sex,
	phone_number
)
values NOT EXISTS(
	'Tom',
	'test@email.com',
	'$2a$10$/Hr9m1n3tDABNJJPCGNEm.XNIkDBpQ5sZs10oLgKSkV9Y88Mo7ZL6',
	'1980/01/01',
	1,
	09012345678
);


INSERT INTO  product_table
 (product_name, product_brand, product_value, product_imege1, product_imege2, product_imege3,)
VALUES
 ('STAN SMITH（Green）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_stansmith.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_b.jpg'),
/* 1 */
 /* 2 */
 ('STAN SMITH（Green）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_stansmith_tricolore.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_tricolore_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_tricolore_b.jpg'),
 /* 3 */
 ('STAN SMITH（kermit）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_stansmith_navyrightblue.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_navyrightblue_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_tricolore_b.jpg'),
 /* 4 */
 ('STAN SMITH（Navy/Lightblue）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_stansmith_kermit.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_kermit_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_kermit_b.jpg'),
 /* 5 */
 ('STAN SMITH（White/CreamWhite/BlueBird）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_stansmith_footwearwhitecreamwhitebluebird.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_footwearwhitecreamwhitebluebird_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_footwearwhitecreamwhitebluebird_b.jpg'),
 /* 6 */
 ('STAN SMITH（White/CrystalWhite/TeamRoyalBlue）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_stansmith_footwearcrystalwhiteteamroyalblue.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_footwearcrystalwhiteteamroyalblue_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_footwearcrystalwhiteteamroyalblue_b.jpg'),
 /* 7 */
 ('STAN SMITH（Black/White/TeamRoyalBlue）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_stansmith_coreblackcrystalwhiteteamroyalblue.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_coreblackcrystalwhiteteamroyalblue_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_stansmith_coreblackcrystalwhiteteamroyalblue_b.jpg'),
 /* 8 */
 ('SUPER STAR（Black）', 'adidas', 7777, '/Sneaks/src/main/resources/static/images/adidas_supersuter.jpg', '/Sneaks/src/main/resources/static/images/adidas_supersuter_s.jpg', '/Sneaks/src/main/resources/static/images/adidas_supersuter_b.jpg'),
 /* 9 */
 ('AirForce1 Fontaka（ArcheoPink）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_airforce1fontaka.jpg', '/Sneaks/src/main/resources/static/images/nike_airforce1fontaka_s.jpg', '/Sneaks/src/main/resources/static/images/nike_airforce1fontaka_b.jpg'),
 /* 10 */
 ('AirForce1 Pixel（White）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_airforce1pixel.jpg', '/Sneaks/src/main/resources/static/images/nike_airforce1pixel_s.png', '/Sneaks/src/main/resources/static/images/nike_airforce1pixel_b.png'),
 /* 11 */
 ('AirJodan1 Mid（WolfGrey）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_airjordan1mid_wolfgrey.jpg', '/Sneaks/src/main/resources/static/images/nike_airjordan1mid_wolfgrey_s.jpg', '/Sneaks/src/main/resources/static/images/nike_airjordan1mid_wolfgrey_b.jpg'),
 /* 12 */
 ('AirMax PRE-DAY（PurpleDawn）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_airmaxpreday.jpg', '/Sneaks/src/main/resources/static/images/nike_airmaxpreday_s.jpg', '/Sneaks/src/main/resources/static/images/nike_airmaxpreday_b.jpg'),
 /* 13 */
 ('AirZoom Pegasus（IndigoHaze/BrightMango）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_airzoompegasus37.jpg', '/Sneaks/src/main/resources/static/images/nike_airzoompegasus37_s.jpg', '/Sneaks/src/main/resources/static/images/nike_airzoompegasus37_b.jpg'),
 /* 14 */
 ('ReactInfinity Run Flyknit2（PinkGraze）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_reactinfinityrunflyknit2.jpg', '/Sneaks/src/main/resources/static/images/nike_reactinfinityrunflyknit2_s.jpg', '/Sneaks/src/main/resources/static/images/nike_reactinfinityrunflyknit2_b.jpg'),
 /* 15 */
 ('RYZ365 2（White/White）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_ryz3652.jpg', '/Sneaks/src/main/resources/static/images/nike_ryz3652_b.jpg', '/Sneaks/src/main/resources/static/images/nike_ryz3652_s.jpg'),
 /* 16 */
 ('ZoomX Vaporfly Next%2（BarelyVolt/Turquoise）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/nike_zoomxvaporflynext.jpg', '/Sneaks/src/main/resources/static/images/nike_zoomxvaporflynext_s.jpg', '/Sneaks/src/main/resources/static/images/nike_zoomxvaporflynext_b.jpg'),
 /* 17 */
 ('NIKE×SACAI LDVWAFFLE（White）', 'Nike', 7777, '/Sneaks/src/main/resources/static/images/sacaixnike_ldvwaffle_triplewhite.jpg', '/Sneaks/src/main/resources/static/images/sacaixnike_ldvwaffle_triplewhite (1).jpg', '/Sneaks/src/main/resources/static/images/sacaixnike_ldvwaffle_triplewhite_b.jpg'),
 /* 18 */
 ('AUTHENTIC（Black）', 'VANS', 7777, '/Sneaks/src/main/resources/static/images/vans_authentic_black.jpg', '/Sneaks/src/main/resources/static/images/vans_authentic_black_s.jpg', '/Sneaks/src/main/resources/static/images/vans_authentic_black_b.jpg'),
 /* 19 */
 ('AUTHENTIC（Red）', 'VANS', 7777, '/Sneaks/src/main/resources/static/images/vans_authentic_red.jpg', '/Sneaks/src/main/resources/static/images/vans_authentic_red_s.jpg', '/Sneaks/src/main/resources/static/images/vans_authentic_red_b.jpg'),
 /* 20 */
 ('AUTHENTIC（White）', 'VANS', 7777, '/Sneaks/src/main/resources/static/images/vans_authentic_white.jpg', '/Sneaks/src/main/resources/static/images/vans_authentic_white_s.jpg', '/Sneaks/src/main/resources/static/images/vans_authentic_white_b.jpg'),
 /* 21 */
 ('CANVAS ALLSTAR COLORS HI（White/Black）', 'Converse', 7777, '/Sneaks/src/main/resources/static/images/converse_allstar.jpg', '/Sneaks/src/main/resources/static/images/converse_allstar_s.jpg', '/Sneaks/src/main/resources/static/images/converse_allstar_b.jpg'),
 /* 22 */
 ('Reebok×atmos INSTAPUMP FURY（CitronAnimal）', 'Reebok', 7777, '/Sneaks/src/main/resources/static/images/reebokxatmos_instapunpfury_citronanimal.jpg', '/Sneaks/src/main/resources/static/images/reebokxatmos_instapunpfurycitronanimal_s.jpg', '/Sneaks/src/main/resources/static/images/reebokxatmos_instapunpfury_citronanimal_b.jpg'),
 /* 23 */
 ('CM996 WR2（Black）', 'New Balance', 7777, '/Sneaks/src/main/resources/static/images/newbalance_cm996wr2.jpg', '/Sneaks/src/main/resources/static/images/newbalance_cm996wr2_s.jpg', '/Sneaks/src/main/resources/static/images/newbalance_cm996wr2_b.jpg'),
 /* 24 */
 ('Jewery（WhiteGray/IceGray）', 'grounds', 7777, '/Sneaks/src/main/resources/static/images/grounds_jewery.jpg', '/Sneaks/src/main/resources/static/images/grounds_jewery_s.jpg', '/Sneaks/src/main/resources/static/images/grounds_jewery_b.jpg');
