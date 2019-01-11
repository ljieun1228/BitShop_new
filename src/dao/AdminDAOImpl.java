package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AdminBean;
import domain.MemberBean;
import pool.Constant;

public class AdminDAOImpl implements AdminDAO{

	private static AdminDAOImpl instance = new AdminDAOImpl();
	private AdminDAOImpl() {}
	public static AdminDAOImpl getInstance() {return instance;}
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	@Override
	public void insertEmployee() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			System.out.println("SQL:::" + sql);
			if (stmt.executeUpdate(sql) == 1) {
				System.out.println("회원가입성공");
			} else {
				System.out.println("회원가입실패");
			}		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ArrayList<AdminBean> secletAllAdim() {
		ArrayList<AdminBean> arrayList = new ArrayList<>();
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
	public ArrayList<AdminBean> secletAdimByauth(String auth) {
		ArrayList<AdminBean> arrayList = new ArrayList<>();
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
	public AdminBean secletAdimByEmployeeNum(String adminNum) {
		AdminBean adminBean = new AdminBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return adminBean;	
	}

	@Override
	public int countAdmin() {
		int count = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	@Override
	public void updateAdminPass(String adminNum, String pass, String newPass) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("관리자 비번 수정 성공");
			} else {
				System.out.println("관리자 비번 수정 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	@Override
	public void updateAdminAuth(String adminNum, String pass, String auth) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("관리자 권한 수정 성공");
			} else {
				System.out.println("관리자 권한 수정 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	@Override
	public void deleteEmployee(String adminNum, String pass) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int result = stmt.executeUpdate(sql);
			if (result == 1) {
				System.out.println("관리자 삭제 성공");
			} else {
				System.out.println("관리자 삭제 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	
}
