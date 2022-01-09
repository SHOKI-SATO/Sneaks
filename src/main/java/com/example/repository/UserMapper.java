package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.user.model.MUser;

@Mapper
public interface UserMapper {
	
	/** ユーザー登録 */
	public int insertOne(MUser user);
	
	/** ユーザー一件取得 */
	public MUser findOne(String userId);
	
	/** ログインユーザー取得 */
	public MUser findLoginUser(String userId);
}
