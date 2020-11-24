package com.insurance.quote.application;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.insurance.quote.entity.Accounts;
import com.insurance.quote.entity.Policy;
import com.insurance.quote.service.PolicyCreationServiceImpl;
import com.insurance.quote.service.ViewPolicyServiceImpl;

/**
 * Servlet implementation class ViewPolicy
 */
@WebServlet("/ViewPolicy")
public class ViewPolicy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		try {
		long account_number=0;
		HttpSession session=request.getSession();
		String role=session.getAttribute("role").toString();
		if(role.equals("User")) {
			String acc=session.getAttribute("uAccNum").toString();
		account_number=Long.parseLong(acc);
		}
		else 
			account_number=Long.parseLong(request.getParameter("account_number"));
		PolicyCreationServiceImpl details=new PolicyCreationServiceImpl();
		ViewPolicyServiceImpl service=new ViewPolicyServiceImpl();
		List<Accounts> account=details.getDetails(account_number);
		List<Policy> policy=service.getPolicy(account_number);
		RequestDispatcher rd=null;
		if(account.size()==0) {
			request.setAttribute("Message","Account Not Found");
		rd=request.getRequestDispatcher("MessageInfo.jsp");
		}
		else {
		request.setAttribute("policy",policy);
		rd=request.getRequestDispatcher("/ViewPolicyInfo.jsp");
		}
		rd.forward(request, response);}
		catch(NumberFormatException | ServletException | IOException ex) {
			System.out.println("Error occured in view Policy");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
