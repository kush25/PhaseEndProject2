package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Users;
import com.service.UserService;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userservice = new UserService();

		String uname = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String upassword = request.getParameter("upassword");
		String city = request.getParameter("ucity");
		
		Users usr = new Users(uname, email, upassword, city);

		boolean reg = userservice.login(usr);

		if (reg) {

			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			
			response.sendRedirect("LoginSuccess.jsp");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			PrintWriter out = response.getWriter();
			rd.include(request, response);
			out.print("<br/>");
			out.print("<h2 style='color:red'>Invalid Credentials</h2>");
		}
		
		
	}

}
