package com.mikespider.springbootMagic.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.mikespider.springbootMagic.entity.Url;

@Component
public class UrlDao {
	private final SqlSession sqlSession;

	public UrlDao(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	 public List<Url> selectAll() {
		 return this.sqlSession.selectList("selectAll");
	 }
}
