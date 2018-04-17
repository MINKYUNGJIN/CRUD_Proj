package com.board.service;

import com.board.domain.boardVO;

public interface boardService {
	
	public void createBoard(boardVO vo)throws Exception;
	
	public void readBoard(int bno)throws Exception;
	
	public void updateBoard(boardVO vo)throws Exception;
	
	public void deleteBoard(int bno)throws Exception;

}
