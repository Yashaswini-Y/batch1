package com.insurance.quote.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.User_Role;
import com.insurance.quote.service.InsuranceServiceImpl;

/**
 * Servlet implementation class AddAccount
 */
@WebServlet("/Account_Creation")
public class Account_Creation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		InsuranceServiceImpl service=new InsuranceServiceImpl();
		String Insured_Name = request.getParameter("Insured_Name");
		String Insured_Street = request.getParameter("Insured_Street");
		String Insured_City = request.getParameter("Insured_City");
		String Insured_State = request.getParameter("Insured_State");
		int Insured_Zip = Integer.parseInt(request.getParameter("Insured_Zip"));
		String business_seg=request.getParameter("bus_Seg");
		String user="102";
		int account=Integer.parseInt(request.getParameter("account"));
		Accounts acc = new Accounts(account,Insured_Name,Insured_Street,Insured_City,Insured_State,Insured_Zip,business_seg,user);
		System.out.println(acc.getBusiness_Segment()+" "+acc.getUser_Name()+" "+acc.getInsured_Name()+" "+acc.getAccount_Number());
		int rows=service.CreateAccount(acc);
		if(rows>0)
			out.println("Account created Successfully....");
		else
			out.println("Unable to create an account....");
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}