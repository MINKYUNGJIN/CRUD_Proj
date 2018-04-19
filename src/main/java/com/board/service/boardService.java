package com.board.service;

import java.util.List;

import com.board.domain.boardVO;

public interface boardService {
	
	public List<boardVO> listBoard() throws Exception;
	
	public void createBoard(boardVO vo)throws Exception;
	
	public boardVO readBoard(int bno)throws Exception;
	
	public void updateBoard(boardVO vo)throws Exception;
	
	public void deleteBoard(int bno)throws Exception;

}
