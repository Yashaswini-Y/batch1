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
import com.insurance.quote.service.UserRoleServiceImpl;

/**
 * Servlet implementation class Profile_Creation
 */
@WebServlet("/Profile_Creation")
public class Profile_Creation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
		PrintWriter out = response.getWriter();
		UserRoleServiceImpl service=new UserRoleServiceImpl();
		String user_Name = request.getParameter("uname");
		String password = request.getParameter("psw");
		String roleCode=request.getParameter("Role_Code");
		if(user_Name!=null && password!=null && roleCode!=null) {
			User_Role profile=new User_Role(user_Name,password,roleCode);
			int rows=service.CreateProfile(profile);
			if(rows>0)
				request.setAttribute("Message", "Profile Created Successfully");
			else 
				request.setAttribute("Message","Profile creation failed");
			RequestDispatcher rd=request.getRequestDispatcher("MessageInfo.jsp");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Login");
		RequestDispatcher rd1=request.getRequestDispatcher("/Login.jsp");
		rd1.forward(request, response);}
		}
		catch(ServletException | IOException ex) {
			System.out.println("Error occured in Profile Creation");
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
