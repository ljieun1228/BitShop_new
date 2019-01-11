package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {

	public void insertAccount(AccountBean account);
	
	public String createAccountNum();
	
	public AccountBean selectAccountByAccountNum(String accountNum);
		
	public ArrayList<AccountBean> selectAllAccount();
	
	public int countAccountNum();
	
	public String selectAccountByOpenDate();
	
	public void deposit(String accountNum,int money);
	
	public void withDraw(String accountNum,int money);
	
	public void deleteAccount(String accountNum);

}
