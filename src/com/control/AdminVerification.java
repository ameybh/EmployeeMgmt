package com.control;
import com.bean.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminVerification extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AdminVerification() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		pw.println("<h1> Unauthorised Access to this Page</h1>");
		pw.println("<h3>Please <a href='LoginAdmin.html'>login</a>first</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("t1");
		String pwd =request.getParameter("t2");
		PrintWriter  out = response.getWriter();
		AdminBean ab = new AdminBean();
		boolean signal = ab.verifyAdmin(name,pwd);
		
		if(signal)  
		{
			 RequestDispatcher rd = request.getRequestDispatcher("WelcomAdmin.jsp");
			 rd.forward(request, response);
		}
		else 
		{	
			 RequestDispatcher rd = request.getRequestDispatcher("ErrorAdmin.jsp");
			 rd.forward(request, response);
			
		}
		
	}

}
