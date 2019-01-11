package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {
	
	public void insertMember(MemberBean member);

	public ArrayList<MemberBean> selectAllMembers();

	public ArrayList<MemberBean> selectMemberByName(String name);

	public MemberBean selectMemberById(String id);

	public int countMember(String id, String pass);
	
	public boolean existMember(String id, String pass);

	public void updateMember(MemberBean member);

	public void deleteMember(String id);

}
