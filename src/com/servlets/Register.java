package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Users;
import com.service.UserService;
import com.utility.HibernateUtility;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserService userservice = new UserService();

		String uname = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String password = request.getParameter("upassword");
		String city = request.getParameter("ucity");

		Users usr = new Users(uname, email, password, city);

		boolean reg = userservice.registration(usr);

		if (reg) {

			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			
			
			response.sendRedirect("RegistrationSuccess.jsp");
		}
		
	
		 else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				PrintWriter out = response.getWriter();
				rd.include(request, response);
				out.print("<br/>");
				out.print("<h2 style='color:red'>User already Exist</h2>");
		}

	}

}


