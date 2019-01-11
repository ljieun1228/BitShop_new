package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}

	@Override
	public void insertMember(MemberBean member) {
		/*try {
			DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement().executeUpdate(String.format(
					"INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(),member.getName(),
					member.getPass(), member.getSsn()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 상단을 DatabaseFactory~~ 이렇게 처리...은닉화, 중복X 이름은 바뀔수 있다.*/
		// void ~~ executeUpdate
		try {
			int rs = DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(
					"INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(),member.getName(),
					member.getPass(), member.getSsn()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> arrayList = new ArrayList<>();
		
		return arrayList;
	}

	@Override
	public ArrayList<MemberBean> selectMemberByName(String name) {
		ArrayList<MemberBean> arrayList = new ArrayList<>();
		
		return arrayList;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = null;
		try {
			ResultSet rs = DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(String.format("SELECT *FROM member\r\n" + 
					"WHERE id LIKE '%s'", id));//오라클 진영
			while (rs.next()) { //검색 된 결과가 존재하면 TRUE리턴
			member = new MemberBean();// 결과가 없을수도 있으니 있을때 와일룹 안에서 멤버빈을 생성한다. 
			member.setId(rs.getString("id"));//rs에 있는 id를 자바 멤버 빈에 넣어준다. 
			member.setName(rs.getString("name"));
			member.setPass(rs.getString("pass"));
			member.setSsn(rs.getString("ssn"));	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;// 값을 담은 멤버를 담아주고 serviceImpl에서 받아줌.
	}
	// 결과는 result-set

	@Override
	public int countMember(String id, String pass) {
		int count = 0;
		return count;
	}
	@Override
	public boolean existMember(String id, String pass) {
		MemberBean member = null;
		boolean exist = false;
		try {
			ResultSet rs = DatabaseFactory.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(String.format("SELECT *FROM member\r\n" + 
					"WHERE id LIKE '%s' AND pass LIKE '%s';",id,pass));
			while(rs.next()){
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setPass(rs.getString("pass"));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exist;
	}

	@Override
	public void updateMember(MemberBean member) {
		
	}

	@Override
	public void deleteMember(String id) {
		
	}
}
