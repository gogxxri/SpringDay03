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
		
		return userDao.getUser(vo);
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
	    userDao.insertUser(vo); 
	}

	@Override
	public void update(UserVO vo) {
		userDao.updateUser(vo);
		
	}

	@Override
	public void delete(UserVO vo) {
		userDao.deleteUser(vo);
		
	}

}
