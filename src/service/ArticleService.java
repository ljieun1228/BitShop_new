package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

		//CREATE
		public void createArticle(String title,String content,String writer);
		//READ
		public ArrayList<ArticleBean> findAllArticle();
		public ArrayList<ArticleBean> findArticleByWriter();
		public ArticleBean findArticleBySeq(String seq);
		public String articleRedDate();
		public int countArticle();
		//UPDATE
		public void changeArticle(String seq,String content);
		//DELETE
		public void removeArticle(String seq);
}