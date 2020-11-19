package com.insurance.quote.application;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.service.InsuranceService;
import com.insurance.quote.service.InsuranceServiceImpl;

/**
 * Servlet implementation class ReportGen
 */
@WebServlet("/Report_Generation")
public class Report_Generation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String account_number=request.getParameter("account_number");
		RequestDispatcher rd=null;
		if(account_number!=null && account_number.length()>=10) {
			
			InsuranceService service=new InsuranceServiceImpl();
			List<Accounts> acc=service.getDetails(Long.parseLong(account_number));
			System.out.println(acc.get(0).getInsured_Name());
			request.setAttribute("Account", acc);
			rd=request.getRequestDispatcher("/Report.jsp");
			rd.forward(request, response);
		}
		else if(account_number==null) 
			out.println("*Account number must not be empty."
					+ " Please fill in the account number");
		else if(account_number.length()<10){
			out.println("Account number should be 10 digits."+" Please enter the correct account number.");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
