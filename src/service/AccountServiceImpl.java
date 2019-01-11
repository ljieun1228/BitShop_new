package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import dao.AccountDAO;
import dao.AccountDAOImpl;
import dao.MemberDAOImpl;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService {

	AccountDAOImpl dao;

	private static AccountServiceImpl instance = new AccountServiceImpl();
	private AccountServiceImpl() {
		dao = AccountDAOImpl.getInstance();
	}
	public static AccountServiceImpl getInstance() {return instance;}

	@Override
	public void openAccount(AccountBean account) {
		AccountDAOImpl.getInstance().insertAccount(account);
	}

	@Override
	public AccountBean findAccountByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		return account;
	}
	
	@Override
	public String createAccountNum() {
		String a = "";
		Random random = new Random();
		for(int i=0;i<12;i++) {
		a+=(i==3)?"-"+random.nextInt(10):random.nextInt(10);	
		}
		return a;
		
	}

	@Override
	public ArrayList<AccountBean> findAllAccount() {
		return null;
	}

	@Override
	public int countAccountNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findAccountByOpenDate() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-mm hh:mm:ss:aa");
		today = sdf.format(date);
		return today;
	}

	@Override
	public void deposit(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDraw(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAccount(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}