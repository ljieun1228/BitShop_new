package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {


	public void openAccount(AccountBean account);
	
	public String createAccountNum();
	
	public AccountBean findAccountByAccountNum(String accountNum);
	
	public ArrayList<AccountBean> findAllAccount();
	
	public int countAccountNum();
	
	public String findAccountByOpenDate();
	
	public void deposit(String accountNum,int money);
	
	public void withDraw(String accountNum,int money);
	
	public void removeAccount(String accountNum);

	
}