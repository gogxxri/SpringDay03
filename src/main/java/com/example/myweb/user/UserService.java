package com.example.myweb.user;

import java.util.List;

import com.example.myweb.board.BoardVO;


public interface UserService {
	
	UserVO getOne(UserVO vo);
	List<UserVO> getUserList();
	
	void insert(UserVO vo);
	void update(UserVO vo);
	void delete(UserVO vo);
}
