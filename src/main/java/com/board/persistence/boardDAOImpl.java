package com.board.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.boardVO;

//솔직히 살짝 이해 안감 ㅎㅎ
@Repository
public class boardDAOImpl implements boardDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.board.mapper.boardMapper";
	
	@Override
	public void createBoard(boardVO vo)throws Exception{
		session.insert(namespace+".createBoard", vo);
	}
	
	@Override
	public void readBoard(int bno)throws Exception{
		session.selectOne(namespace+".readBoard", bno);
	}
	
	@Override
	public void updateBoard(boardVO vo)throws Exception{
		session.update(namespace+".updateBoard", vo);
	}
	
	@Override
	public void deleteBoard(int bno)throws Exception{
		session.delete(namespace+".deleteBoard", bno);
	}
	
}
