package com.Dipraj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet_Post extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		
		int k = i + j;
		PrintWriter out = res.getWriter();
		out.println("Result is: " + k);
		
		
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		int k = i + j;
		// req Disputer  helps to re direct the request from one selvlet to another
		
		req.setAttribute("k", k);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		
		rd.forward(req, res);
			
			
	}

}
