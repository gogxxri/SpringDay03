package com.example.myweb.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myweb.user.UserService;
import com.example.myweb.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;

	@Override
	public UserVO getOne(UserVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public List<UserVO> getUserList() {
		
		List<UserVO> userList = userDao.getUserList();
		
		if(userList != null) {
			return userList;
		} else {
			return null;
		}
	}

	@Override
	public void insert(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

}
