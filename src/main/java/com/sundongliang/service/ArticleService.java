package com.sundongliang.service;

import java.util.List;

import com.sundongliang.entity.Article;

public interface ArticleService {

	List<Article> list(String created1, String created2, String ReverseOrder);

}
