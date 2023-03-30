package com.douzone.business.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.business.vo.BusinessVo;


@Repository
public class BusinessRepository {
	@Autowired
	private SqlSession sqlSession;

	
	public Boolean insert(BusinessVo vo) {
		return 1 == sqlSession.insert("guestbook.insert", vo);
	}
	
}