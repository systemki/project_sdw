package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.service.MemberService;
import lombok.Data;




@Controller
public class HomeController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("home");
		mv.addObject("name","홍길동");
		   System.out.println(memberService.getMember("abc"));
		return mv;
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView signinGet(ModelAndView mv,
			UserVo user, 
			@RequestParam("hobby") String[] hobby) {
		mv.setViewName("signin");
		System.out.println(user.getId());
		System.out.println(user.getPw());
		for(String temp : hobby) {
			System.out.println("취미" + temp);
		}

		return mv;
		
	}
	
}
@Data
class UserVo{
	private String id;
	private String pw;
}
