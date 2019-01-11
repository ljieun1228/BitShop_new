package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AccountBean accountBean = new AccountBean();
		
		System.out.println("***account 서블릿으로 들어옴***");

		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		
		String dir = request.getParameter("dir");
		if (dir == null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
		}

		String page = request.getParameter("page");
		page = "main";
		String dest = request.getParameter("dest");
		
		page = (page == null) ? "main" : page;
		
		System.out.println("cmd:"+cmd);
		
		switch (cmd) {
		
		case "move":
			if(dest==null) {dest = "NONE";}
			request.setAttribute("dest",dest);
			Command.move(request, response, dir, page);
			break;
			
		case "open-account":
			String money = request.getParameter("money");
			Command.move(request, response, dir, page);
			break;
			
		case "account-detail" :
			
			
			break;
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
