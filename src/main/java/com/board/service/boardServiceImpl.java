package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.domain.boardVO;
import com.board.persistence.boardDAO;

@Service
public class boardServiceImpl implements boardService{
	
	@Inject
	private boardDAO dao; 
	
	public List<boardVO> listBoard() throws Exception {
		return dao.listBoard();
	}
	
	public void createBoard(boardVO vo)throws Exception{
		dao.createBoard(vo);
	}
	
	public boardVO readBoard(int bno)throws Exception{
		return dao.readBoard(bno);
	}
	
	public void updateBoard(boardVO vo)throws Exception{
		dao.updateBoard(vo);
	}
	
	public void deleteBoard(int bno)throws Exception{
		dao.deleteBoard(bno);
	}

	

}
