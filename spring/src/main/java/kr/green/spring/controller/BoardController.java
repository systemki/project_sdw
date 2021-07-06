package kr.green.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVO;

@Controller
public class BoardController{
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board/list")
	public ModelAndView BoardList(ModelAndView mv) {
		//서비스에게 게시글을 가져오라고 시킴 
		ArrayList<BoardVO> list = boardService.getBoardList();
		
		mv.addObject("list",list);
		if(list !=  null) {
			for(BoardVO tmp : list) {
				System.out.println(tmp);
			}
		}
		mv.setViewName("board/list");
				return mv;
				
				
	}
	
}
