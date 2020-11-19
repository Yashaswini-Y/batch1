package com.insurance.quote.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.quote.entity.User_Role;
import com.insurance.quote.service.InsuranceServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String user=request.getParameter("userName");
		String pass=request.getParameter("password");
		InsuranceServiceImpl service=new InsuranceServiceImpl();
		User_Role details=new User_Role();
		details=service.getUser(user);
		String existUser=details.getUser_Name();
		String existPass=details.getPassword();
		
		RequestDispatcher rd;
		if(user.equals(existUser) ) {
			if(pass.equals(existPass)) {
			    rd=request.getRequestDispatcher("Successful_Login");
			    rd.forward(request, response);
			}
			else
				out.println("Incorrect Password");
		}
		else
			out.println("User details not found");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
