package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerUIInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		customer.setCustomerId(Integer.parseInt((request.getParameter("customerId"))));
		customer.setBillAmount(Integer.parseInt((request.getParameter("billAmount"))));
		customer.setCustomerName(request.getParameter("customerName"));
		customer.setCustomerAddress(request.getParameter("customerAddress"));
		CustomerDAO custdao = new CustomerDAOImpl();
		custdao.insertCustomerDetails(customer);
		response.getWriter().println("<a href='thanks.html'>Click Me</a>");

	}

}
