package com.board.persistence;


import java.util.List;

import com.board.domain.boardVO;

public interface boardDAO {
	
	public void createBoard(boardVO vo)throws Exception;
	
	public boardVO readBoard(int bno)throws Exception;
	
	public void updateBoard(boardVO vo)throws Exception;
	
	public void deleteBoard(int bno)throws Exception;

	public List<boardVO> listBoard() throws Exception;
	
}
