package com.mikespider.springbootMagic.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mikespider.springbootMagic.entity.Url;
@Repository
public interface UrlMapper {
	public List<Url> selectAll();
}
