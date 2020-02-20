package com.sundongliang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundongliang.entity.Article;
import com.sundongliang.mapper.ArticleMapper;
import com.sundongliang.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper mapper;

	@Override
	public List<Article> list(String created1, String created2,String ReverseOrder) {
		return mapper.list(created1,created2,ReverseOrder);
	}
}
