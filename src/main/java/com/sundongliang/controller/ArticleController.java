package com.sundongliang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sundongliang.entity.Article;
import com.sundongliang.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	ArticleService service;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")int pageNum,Model m,String created1,String created2,String ReverseOrder){
		System.out.println(created1);
		PageHelper.startPage(pageNum, 5);
		List<Article> list = service.list(created1,created2,ReverseOrder);
		PageInfo<Article> page = new PageInfo<Article>(list);
		m.addAttribute("list", list);
		m.addAttribute("page", page);
		m.addAttribute("created1", created1);
		m.addAttribute("created2", created2);
		m.addAttribute("ReverseOrder", ReverseOrder);
		
		return "list";
	}
}
