package com.example.domain.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private PasswordEncoder encoder;
	
	/** ユーザー登録 */
	@Override
	public void signup(MUser user) {
		user.setRole("user");
		//パスワード暗号化
		String rawPassword = user.getPassword();
		user.setPassword(encoder.encode(rawPassword));
		mapper.insertOne(user);
	};
	
	@Override
	/** ユーザー一件取得 */
	public MUser getUserOne(String userId) {
		return mapper.findOne(userId);
	}
	
	/** ログインユーザー情報取得 */
	@Override
	public MUser getLoginUser(String userId) {
		return mapper.findLoginUser(userId);
	}

}
