package com.example.myweb.user;

import java.util.List;

import com.example.myweb.board.BoardVO;


public interface UserService {

	public List<UserVO> getList(Object object);
	
	UserVO getOne(UserVO vo);
	List<UserVO> getList(UserVO vo);
	
	void insert(UserVO vo);
	void update(UserVO vo);
	void delete(UserVO vo);
}
