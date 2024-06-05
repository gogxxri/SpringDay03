package com.example.myweb.user.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.myweb.user.UserVO;

@Repository("userDAO")
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	final String SQL_GET = "select * from users where id=?";
	final String SQL_LIST = "select * from users order by id desc";
	final String SQL_INSERT = "insert into users(id, password, name, role) " +
						"values(?,?,?,?)";
	final String SQL_UPDATE = "update users set password=?, name=?, role=? where id=?";
	final String SQL_DELETE = "delete from users where id=?";
	
	// 멤버 등록
	public void insertUser(UserVO vo) {
		System.out.println("===> insertUser() - UserDAO 기능 처리");
		jdbcTemplate.update(SQL_INSERT, vo.getId(), vo.getPassword(), vo.getName(), vo.getRole());
	}
	
	// 글수정
	public void updateUser(UserVO vo) {
		System.out.println("===> updateUser() - UserDAO기능 처리");
		jdbcTemplate.update(SQL_UPDATE, vo.getPassword(), vo.getName(), vo.getRole());
	}
	
	// 글삭제
	public void deleteUser(UserVO vo) {
		System.out.println("===> deleteUser() - UserDAO 기능 처리");
		jdbcTemplate.update(SQL_DELETE, vo.getId());				
	}
	
	class UserMapper implements RowMapper<UserVO> {
		@Override
		public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// DB테이블의 필드와 자바 객체 필드를 매핑한다.
			// 이 위치가 while문에 사용되었던 rs.next()를 실행 한것과 같다.
			UserVO user= new UserVO();
			user.setId(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setName(rs.getString(3));
			user.setRole(rs.getString(4));
			return user;
		}
	}
	
	// 글 상세 조회
	public UserVO getUser(UserVO vo) {
		System.out.println("===> getUser() - UserDAO 기능 처리");
		UserMapper rowMapper = new UserMapper();
		Object[] objArr = new Object[]{vo.getId()};
		UserVO user = jdbcTemplate.queryForObject(SQL_GET, objArr, rowMapper);
		return user;
	}
	
	// 유저 목록 조회
	public List<UserVO> getUserList() {
		System.out.println("===> getUserList() - UserDAO 기능 처리");
		UserMapper rowMapper = new UserMapper();
		List<UserVO> userList = jdbcTemplate.query(SQL_LIST, rowMapper);
		System.out.println(userList);
		return userList;
	}
}