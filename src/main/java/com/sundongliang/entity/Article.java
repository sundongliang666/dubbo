package com.sundongliang.entity;

public class Article {

	private Integer id;
	private String title;
	private String content;
	private Integer user_id;
	private String username;
	private Integer commentCnt;
	private String created;
	private String updated;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(Integer commentCnt) {
		this.commentCnt = commentCnt;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public Article(Integer id, String title, String content, Integer user_id,
			String username, Integer commentCnt, String created, String updated) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.user_id = user_id;
		this.username = username;
		this.commentCnt = commentCnt;
		this.created = created;
		this.updated = updated;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content="
				+ content + ", user_id=" + user_id + ", username=" + username
				+ ", commentCnt=" + commentCnt + ", created=" + created
				+ ", updated=" + updated + "]";
	}

	
}