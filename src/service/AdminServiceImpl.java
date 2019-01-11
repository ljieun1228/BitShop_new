package service;

import java.util.ArrayList;

import dao.AdminDAOImpl;
import domain.AdminBean;

public class AdminServiceImpl implements AdminService{

	AdminDAOImpl dao;
	
	private static AdminServiceImpl instance = new AdminServiceImpl();
	private AdminServiceImpl() {
		dao = AdminDAOImpl.getInstance(); 
	}
	public static AdminServiceImpl getInstance() {return instance;}
		
	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AdminBean> findAllAdim() {
		ArrayList<AdminBean> arrayList = new ArrayList<>();
		// TODO Auto-generated method stub
		return arrayList;
	}

	@Override
	public ArrayList<AdminBean> findAdimByauth(String auth) {
		ArrayList<AdminBean> arrayList = new ArrayList<>();
		// TODO Auto-generated method stub
		return arrayList;
	}

	@Override
	public AdminBean findAdimByEmployeeNum(String adminNum) {
		AdminBean adminBean = new AdminBean();
		// TODO Auto-generated method stub
		return adminBean;
	}


	@Override
	public int countAdmin() {
		int count = 0;
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void changeAdminPass(String adminNum, String pass, String newPass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeAdminAuth(String adminNum, String pass, String auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee(String adminNum, String pass) {
		// TODO Auto-generated method stub
		
	}

}
