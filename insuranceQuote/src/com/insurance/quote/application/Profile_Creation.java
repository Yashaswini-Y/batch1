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
 * Servlet implementation class Profile_Creation
 */
@WebServlet("/Profile_Creation")
public class Profile_Creation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		InsuranceServiceImpl service=new InsuranceServiceImpl();
		String user_Name = request.getParameter("uname");
		String password = request.getParameter("psw");
		String roleCode=request.getParameter("Role_Code");
		System.out.println(user_Name+""+password+""+roleCode);
		if(user_Name!=null && password!=null && roleCode!=null) {
			User_Role profile=new User_Role(user_Name,password,roleCode);
			int rows=service.CreateProfile(profile);
			if(rows>0)
			out.println("Profile Created Successfully");
			else 
				out.println("Profile creation failed");
			RequestDispatcher rd=request.getRequestDispatcher("/SuccessFul_Login.jsp");
			rd.forward(request, response);
			
		}
		else 
			out.println("Unable to create a profile");
			RequestDispatcher rd=request.getRequestDispatcher("/SuccessFul_Login.jsp");
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
