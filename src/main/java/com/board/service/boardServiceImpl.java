package com.board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import com.board.domain.boardVO;

import com.board.persistence.boardDAO;

@Service
public class boardServiceImpl implements boardService{
	
	@Inject
	private boardDAO dao; 
	
	public void createBoard(boardVO vo)throws Exception{
		dao.createBoard(vo);
	}
	
	public void readBoard(int bno)throws Exception{
		dao.readBoard(bno);
	}
	
	public void updateBoard(boardVO vo)throws Exception{
		dao.updateBoard(vo);
	}
	
	public void deleteBoard(int bno)throws Exception{
		dao.deleteBoard(bno);
	}

}
