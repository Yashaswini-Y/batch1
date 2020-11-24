package com.insurance.quote.application;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.service.AccountCreationServiceImpl;

/**
 * Servlet implementation class AddAccount
 */
@WebServlet("/Account_Creation")
public class Account_Creation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
		HttpSession session=request.getSession();
		AccountCreationServiceImpl service=new AccountCreationServiceImpl();
		String Insured_Name = request.getParameter("Insured_Name");
		String Insured_Street = request.getParameter("Insured_Street");
		String Insured_City = request.getParameter("Insured_City");
		String Insured_State = request.getParameter("Insured_State");
		int Insured_Zip = Integer.parseInt(request.getParameter("Insured_Zip"));
		String business_seg=request.getParameter("bus_Seg");
		String user=session.getAttribute("user").toString();
		Accounts ac=new Accounts();
		long  account=ac.getAccount_Number();
		Accounts acc = new Accounts(account,Insured_Name,Insured_Street,Insured_City,Insured_State,Insured_Zip,business_seg,user);
		session.setAttribute("busName",acc.getBusiness_Segment());
		int rows=service.CreateAccount(acc);
		RequestDispatcher rd=null;
		if(rows>0) {
			request.setAttribute("Message", "Account created Successfully....");
		}
		else
			request.setAttribute("Message","Unable to create an account....");
		rd=request.getRequestDispatcher("MessageInfo.jsp");
		rd.forward(request, response);
		}
		catch(ServletException | IOException ex) {
			System.out.println("Error occured in account Creation");
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}