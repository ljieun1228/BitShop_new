package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(">>>>>>>member 서블릿으로 들어옴<<<<<<<<");
		
		MemberBean member = null;
		MemberService mService = MemberServiceImpl.getInstance();
		
		/**
		 * 디폴트값
		 * URL 파라미터의 역할
		 * cmd : move 
		 * dir : member - 경로 설정
		 * page : main 
		 * dest : NONE - 인클루드 , 컴포넌트 객체
		 * */
		
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		String dir = request.getParameter("dir");
		if (dir == null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);}
		String page = request.getParameter("page");
		if (page == null) {page = "main";}
		String dest = request.getParameter("dest");
		if (dest == null) {dest = "NONE";}
		
//-----------------------------------------------------------------------//	
		HttpSession session = request.getSession();

		switch (cmd) {
		case "login"://cmd:login dir:home page:main dest:NONE
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			boolean loginOK = mService.existMember(id, pass);
			System.out.println("로그인OK참거짓"+loginOK);
			if(loginOK) {
				member = new MemberBean();
				request.setAttribute("dest", "welcome");
				member = mService.findMemberById(request.getParameter("uid"));
				session.setAttribute("user", member);
			}else{
				dir = "home";
				page = "index";
			}
			break;

		case "move":
			request.setAttribute("dest",dest);
			break;
			
		case "join" :
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			mService.creatMember(member);//DB에 멤버 값을 넣어줌.
			session.setAttribute("user",member);
			request.setAttribute("dest",request.getParameter("dest"));//dest=join-form
			break;
		
		case "logout":
			dir = "";
			page = "index";
			dest = "";
			session.invalidate();//세션로그아웃
			break;
			
		
		}
		Command.move(request, response, dir, page);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
