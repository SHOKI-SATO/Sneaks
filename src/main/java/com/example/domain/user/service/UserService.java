package com.example.domain.user.service;

import com.example.domain.user.model.MUser;

public interface UserService {
	
	/** ユーザー登録 */
	public void signup(MUser user);
	
	/** ユーザー一件取得 */
	public MUser getUserOne(String userId);
	
	/** ログインユーザー情報取得 */
	public MUser getLoginUser(String userId);

}
