package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleDAO {

	//CREATE
	public void insertArticle(String title,String content,String writer);
	//READ
	public ArrayList<ArticleBean> selectAllArticle();
	public ArrayList<ArticleBean> selectArticleByWriter();
	public ArticleBean selectArticleBySeq(String seq);
	public String articleRedDate();
	public int countArticle();
	//UPDATE
	public void updateArticle(String seq,String content);
	//DELETE
	public void deleteArticle(String seq);
	
}
