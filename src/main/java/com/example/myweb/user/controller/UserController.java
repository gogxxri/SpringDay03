package com.example.myweb.user.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.myweb.board.controller.BoardController;
import com.example.myweb.user.UserService;
import com.example.myweb.user.UserVO;

@Controller
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	public String boardList(Locale locale, Model model) throws SQLException {
		
		//System.out.println(ds.getConnection());
		//Connection conn = jdbcUtil.getConnection();
		//System.out.println(conn);
		
		List<UserVO> boardList = userService.getList(null);
		model.addAttribute("boardList", boardList);
		
		return "user/list";
	}
	
	@RequestMapping(value="/userDetail", method=RequestMethod.GET)
	public String boardDetail(@RequestParam("id") String id, Model model) throws SQLException {
		//System.out.println("boardDetail >>>> seq : " + seq);
		
		UserVO vo = new UserVO();
		vo.setId(id);
		UserVO user = userService.getOne(vo);
		model.addAttribute("board", user);
		
		return "user/detail";
	}
	
	@RequestMapping(value="/userUpdate", method=RequestMethod.GET)
	public String boardUpdate(@RequestParam("id") String id, Model model) {
		
		UserVO vo = new UserVO();
		vo.setId(id);
		UserVO board = userService.getOne(vo);
		model.addAttribute("board", board);
		
		return "user/update";
	}
	
	/*@RequestMapping(value="/userUpdate", method=RequestMethod.POST)
	public String boardUpdate2(@RequestParam Map<String, String> params, Model model) {
		
		Iterator it = params.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		return "redirect:userList";
	}*/
	
	@RequestMapping(value="/userUpdate", method=RequestMethod.POST)
	public String boardUpdate2(UserVO vo, Model model) {
		
		//System.out.println(vo);
		userService.update(vo);
		
		return "redirect:userList";
	}
	
	@RequestMapping(value="/userWrite", method=RequestMethod.GET)
	public String boardWrite(UserVO vo) {
		return "user/write";
	}
	
	@RequestMapping(value="/userWrite", method=RequestMethod.POST)
	public String boardWriteOk(UserVO vo) {
		
		//System.out.println("vo ===> " + vo);
		
		userService.insert(vo);
		
		return "redirect:userList";
	}
	
	@RequestMapping(value="/userDelete", method=RequestMethod.GET)
	public String boardDelete(UserVO vo) {
		
		userService.delete(vo);
		
		return "redirect:userList";
	}
	
}
