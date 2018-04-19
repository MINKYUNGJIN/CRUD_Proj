package com.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.boardVO;
import com.board.service.boardService;

@Controller
@RequestMapping("/*")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private boardService bservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		

		return "home";
	}

	@RequestMapping(value="/viewBoard", method = RequestMethod.GET)
	public String viewBoard(boardVO vo, Model model)throws Exception{
		
		List<boardVO> blist = bservice.listBoard();
		
		model.addAttribute("blist", blist);
		
		return "/viewBoard";
	}
	
	@RequestMapping(value="/createBoard", method = RequestMethod.GET)
	public String createBoardGET(boardVO vo, Model model)throws Exception{
		
		return "/createBoard";
	}
	
	@RequestMapping(value="/createBoard", method = RequestMethod.POST)
	public String createBoard(boardVO vo, Model model)throws Exception{
		
		bservice.createBoard(vo);
		return "redirect:/viewBoard";
	}
	
	@RequestMapping(value="/readBoard", method = RequestMethod.GET)
	public String readBoard(boardVO vo, Model model)throws Exception{
		
		int bno = vo.getBno(); 
		boardVO boardVO = bservice.readBoard(bno);
		
		model.addAttribute("boardVO", boardVO);
		
		return "/readBoard";
	}
	
	@RequestMapping(value="/deleteBoard", method = RequestMethod.POST)
	public String deleteBoard(boardVO vo, Model model)throws Exception{
		
		System.out.println(vo.getBno());
		bservice.deleteBoard(vo.getBno());
		return "redirect:/viewBoard";
	}
	
}
