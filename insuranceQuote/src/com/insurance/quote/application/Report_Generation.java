package com.insurance.quote.application;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.service.PolicyCreationServiceImpl;
import com.insurance.quote.service.ReportGenerationServiceImpl;

/**
 * Servlet implementation class ReportGen
 */
@WebServlet("/Report_Generation")
public class Report_Generation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
		String account_number=null;
		account_number=request.getParameter("account_number");
		RequestDispatcher rd=null;
			long accNum=Long.parseLong(account_number);
			ReportGenerationServiceImpl service=new ReportGenerationServiceImpl();
			PolicyCreationServiceImpl details=new PolicyCreationServiceImpl();
			List<Accounts> acc=details.getDetails(accNum);
				if(acc.size()==0) {
					request.setAttribute("Message","Account Not Found");
					rd=request.getRequestDispatcher("MessageInfo.jsp");
					}
				else {
			request.setAttribute("Account", acc);
			List<String> ques=service.getQues(accNum);
			List<String> ans=service.getAns(accNum);
			double premium=service.getFinalPremium(accNum);
			request.setAttribute("Ques", ques);
			request.setAttribute("Ans",ans);
			request.setAttribute("premium",premium);
			rd=request.getRequestDispatcher("/Report_Generation_Results.jsp");
			}
		rd.include(request, response);
		}
        catch(ServletException | IOException ex) {
			System.out.println("Error occured in Report Generation");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  {
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("HomePage");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println("Error occured in Report Generation");
		}
	}

}
