package dao;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminDAO {

	public void insertEmployee();

	public ArrayList<AdminBean> secletAllAdim();

	public ArrayList<AdminBean> secletAdimByauth(String auth);

	public AdminBean secletAdimByEmployeeNum(String adminNum);

	public int countAdmin();

	public void updateAdminPass(String adminNum, String pass, String newPass);

	public void updateAdminAuth(String adminNum, String pass, String auth);

	public void deleteEmployee(String adminNum, String pass);

}
