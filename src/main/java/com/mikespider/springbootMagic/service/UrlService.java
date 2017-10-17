package com.mikespider.springbootMagic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikespider.springbootMagic.dao.UrlDao;

@Service
public class UrlService {
	@Autowired
	UrlDao urldao;

	public String getString() {
		System.out.println(urldao==null);
		return urldao.selectAll().get(0).toString();
	}
}
