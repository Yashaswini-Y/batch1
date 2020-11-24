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
import com.insurance.quote.entity.Policy_Details;
import com.insurance.quote.entity.Policy_Questions;
import com.insurance.quote.service.PolicyCreationServiceImpl;

/**
 * Servlet implementation class PolicyCreation
 */
@WebServlet("/Policy_Creation")
public class Policy_Creation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		try {
		String account_number=request.getParameter("account_number");
		long accNum=Long.parseLong(account_number);
		request.setAttribute("acc_Num",accNum);
		PolicyCreationServiceImpl service = new PolicyCreationServiceImpl();
		List<Accounts> account=service.getDetails(accNum);
		String segmentName=account.get(0).getBusiness_Segment();
		List<Policy_Questions> lis1=service.getPolicy_Questions(segmentName);
		request.setAttribute("policy", lis1);
		RequestDispatcher rd=request.getRequestDispatcher("/Policy_Creation.jsp");
		rd.forward(request, response);
		}
		catch(ServletException | IOException ex){
			System.out.println("Error occured in Policy creation");
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		PolicyCreationServiceImpl service=new PolicyCreationServiceImpl();
		HttpSession session=request.getSession();
		String account_number="0";
		account_number=request.getParameter("acc_num");
		long accNum=0;
		accNum=Long.parseLong(account_number); 
		List<Accounts> account=service.getDetails(accNum);
			if(account.size()==0)
				request.setAttribute("Message","No details found ");
			else {
		String segmentName=account.get(0).getBusiness_Segment();
		String[] str=new String[5];
		str[0]=request.getParameter("ans1");
		str[1]=request.getParameter("ans2");
		str[2]=request.getParameter("ans3");
		str[3]=request.getParameter("ans4");
		str[4]=request.getParameter("ans5");
		double premium=service.getPremium(segmentName, str);
		Policy policy=new Policy(premium,accNum);
		int rows=service.CreatePolicy(policy);
		int policy_num=policy.getPolicy_Number();
		session.setAttribute("Pol_Num", policy_num);
		int rows1=0;
		if(rows>0) {
			List<Policy_Questions> lis1=service.getPolicy_Questions(segmentName);
			String[] quesId=new String[5];
			rows1=0;
			for(int i=0;i<str.length;i++) {
				quesId[i]=lis1.get(i).getPol_Ques_Id();
			Policy_Details details=new Policy_Details(policy_num,quesId[i],str[i]);
			rows1+=service.CreatePolicyDetails(details);
			}
			}
			if(rows1==0)
				request.setAttribute("Message","Unable to add policy details..");
			if(rows==0)
				request.setAttribute("Message","Unable to create a policy..");
			if(rows!=0 && rows1!=0)
			request.setAttribute("Message","Policy created and details added Successfully");}
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("MessageInfo.jsp");
		rd.forward(request, response);}
		catch(ServletException | IOException ex){
			System.out.println("Error occured in Policy creation");
		}
		
}
}
