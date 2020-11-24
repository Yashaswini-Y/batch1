package com.insurance.quote.application;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.insurance.quote.service.InsuranceServiceImpl;

/**
 * Servlet implementation class Successful_Login
 */
@WebServlet("/HomePage")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
		HttpSession session=request.getSession();
		String userName=session.getAttribute("user").toString();
		String role=session.getAttribute("role").toString();
		InsuranceServiceImpl service=new InsuranceServiceImpl();
		if(role.equals("User")) {
			long accNum=service.getAccountNumber(userName);
			request.setAttribute("accNumber",accNum);
			}
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("HomePage.jsp");
		rd.forward(request, response);}
		catch(ServletException | IOException ex) {
			System.out.println("Error occured in Home Page");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException  {
		doGet(request, response);
		
	}

}
