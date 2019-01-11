package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {

	public static void move(HttpServletRequest request, HttpServletResponse response, String dir, String page)
			throws ServletException, IOException {
		String dispatcher = Constant.VIEW + dir + "/" + page + Constant.JSP;
		if(page.equals("index")){
			dispatcher = "index" + Constant.JSP;
		}else {
			dispatcher = Constant.VIEW + dir + "/" + page + Constant.JSP;
		}
			
		System.out.println("dispatcher >>>>>" + dispatcher);
		request.getRequestDispatcher(dispatcher).forward(request, response);
		
	
		//System.out.println(String.format("request: %s, response: %s, dir: %s, page: %s",request, response, dir, page));
		//dispatcher =(page.equals("index"))? "index" + Constant.JSP : Constant.VIEW + dir + "/" + page + Constant.JSP ; 
				
		
			
		//request.getRequestDispatcher("WEB-INF/view/member/main.jsp").forward(request, response);

	}
}
