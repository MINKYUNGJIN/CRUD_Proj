package com.board.controller;

import java.text.DateFormat;
import java.util.Date;
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

	@RequestMapping(value="/createBoard", method = RequestMethod.GET)
	public String createBoardGET(boardVO vo, Model model)throws Exception{
		
		bservice.createBoard(vo);
		
		return "/writeBoard";
	}
	
	@RequestMapping(value="/createBoard", method = RequestMethod.POST)
	public String createBoardPOST(boardVO vo, Model model)throws Exception{
		
		bservice.createBoard(vo);
		
		return "/writeBoard";
	}
	
	@RequestMapping(value="/readBoard", method = RequestMethod.GET)
	public String writeBoardGET(boardVO vo, int bno, Model model)throws Exception{
		
	/*	bservice.readBoard(bno);*/
		
		return "redirect:/readBoard";
	}
	
	@RequestMapping(value="/readBoard", method = RequestMethod.POST)
	public String writeBoardPOST(boardVO vo, int bno, Model model)throws Exception{
		
/*		bservice.readBoard(bno);
		*/
		return "redirect:/readBoard";
	}
	
}
