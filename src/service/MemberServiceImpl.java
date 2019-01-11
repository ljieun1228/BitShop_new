package service;

import java.util.ArrayList;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	MemberDAOImpl dao;
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance(); //코딩을 여러번해야 해서 생성자에 초기화 해준다. 
	}
	public static MemberServiceImpl getInstance() {return instance;}
	
	@Override
	public void creatMember(MemberBean member) {
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist = false;	
		MemberBean memberBean =null;
		memberBean = dao.selectMemberById(id);
		if(memberBean.getPass().equals(pass)) {
			exist = true;
		}
		return exist;
	}

	@Override
	public void changeMember(MemberBean member) {
		
	}

	@Override
	public void removeMember(String id) {
		
	}

}