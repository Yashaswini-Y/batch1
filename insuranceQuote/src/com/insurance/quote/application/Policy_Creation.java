package com.insurance.quote.application;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.quote.entity.Bussiness_Segment;
import com.insurance.quote.entity.Policy_Questions;
import com.insurance.quote.service.InsuranceService;
import com.insurance.quote.service.InsuranceServiceImpl;

/**
 * Servlet implementation class PolicyCreation
 */
@WebServlet("/Policy_Creation")
public class Policy_Creation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String segmentId = request.getParameter("Bus_Seg_Id");
		InsuranceService service = new InsuranceServiceImpl();
		Bussiness_Segment business=new Bussiness_Segment();
		if(segmentId.equals(business.getBus_Seg_Id())) {
		List<Policy_Questions> list=service.getPolicyQuestions(business);
		request.setAttribute("policycre", list);
		RequestDispatcher rd=request.getRequestDispatcher("/Policy_Creation.jsp");
		rd.include(request, response);
		}
	}

}
