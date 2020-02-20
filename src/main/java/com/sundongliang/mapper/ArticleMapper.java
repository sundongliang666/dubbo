package com.sundongliang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sundongliang.entity.Article;

public interface ArticleMapper {

	List<Article> list(@Param("created1")String created1, @Param("created2")String created2,@Param("ReverseOrder")String ReverseOrder);

	/*@Select("select a.id,a.title,a.content,a.commentCnt,a.created,a.updated,u.username from cms_article a LEFT JOIN cms_user u on a.user_id = u.id")
	List<Article> list(String created1, String created2);*/

	

}
