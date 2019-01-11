package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;

public class AccountDAOImpl implements AccountDAO {

	private static AccountDAOImpl instance = new AccountDAOImpl();

	private AccountDAOImpl() {
	}

	public static AccountDAOImpl getInstance() {
		return instance;
	}

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void insertAccount(AccountBean account) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			// 오라클 DB에 있는 클래스를 호출
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String createAccountNum() {
		String acc = "";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}

	@Override
	public AccountBean selectAccountByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accountBean;
	}

	@Override
	public ArrayList<AccountBean> selectAllAccount() {
		ArrayList<AccountBean> arrayList = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return arrayList;
	}

	@Override
	public int countAccountNum() {
		int acc = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}

	@Override
	public String selectAccountByOpenDate() {
		String openDate = "";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return openDate;
	}

	@Override
	public void deposit(String accountNum, int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("예금성공");
			} else {
				System.out.println("예금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void withDraw(String accountNum, int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("출금성공");
			} else {
				System.out.println("출금실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAccount(String accountNum) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("계좌 삭제 성공");
			} else {
				System.out.println("계좌 삭제 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
