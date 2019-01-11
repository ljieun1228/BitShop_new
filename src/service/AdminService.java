package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {

	public void createEmployee();
	
	public ArrayList<AdminBean> findAllAdim();
	public ArrayList<AdminBean> findAdimByauth(String auth);
	public AdminBean findAdimByEmployeeNum(String adminNum);

	public int countAdmin();
	
	public void changeAdminPass(String adminNum,String pass,String newPass);
	public void changeAdminAuth(String adminNum,String pass,String auth);
	
	public void removeEmployee(String adminNum,String pass);
}