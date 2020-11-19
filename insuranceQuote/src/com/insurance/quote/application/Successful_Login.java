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
 * Servlet implementation class Successful_Login
 */
@WebServlet("/Successful_Login")
public class Successful_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String userId=request.getParameter("userName");
		
		InsuranceServiceImpl service=new InsuranceServiceImpl();
		User_Role users=service.getUser(userId);
		System.out.println();
		String user=users.getRole_Code();
		request.setAttribute("user", user);
		request.setAttribute("unames", users.getUser_Name());
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("/SuccessFul_Login.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
