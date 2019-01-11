package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public class ArticleDAOImpl implements ArticleDAO {

	private static ArticleDAOImpl instance = new ArticleDAOImpl();
	private ArticleDAOImpl() {}
	public static ArticleDAOImpl getInstance() {
		return instance;
	}

	@Override
	public void insertArticle(String title, String content, String writer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ArticleBean> selectAllArticle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> selectArticleByWriter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean selectArticleBySeq(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String articleRedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countArticle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateArticle(String seq, String content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(String seq) {
		// TODO Auto-generated method stub
		
	}

}
