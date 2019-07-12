package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmpDAO;
import com.bean.Employee;


public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Update() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		pw.println("<h1> Unauthorised Access to this Page</h1>");
		pw.println("<h3>Please <a href='LoginAdmin.html'>login</a>first</h3>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname =request.getParameter("f1");
		String urole =request.getParameter("f2");
		Employee e3 = new Employee();
		e3.setUsernamei(uname);
		e3.setRolei(urole);
		PrintWriter  out = response.getWriter();
		EmpDAO ed = new EmpDaoImple();
		boolean signal = ed.update(e3);
		if(signal) 
		{
			 out.println("<html>"
	            		+ "<body><b>Successfully Updated"
	                        + "</b>"
	                        + "<h3> Want to do it again? <button onclick=location.href='http://localhost:8080/EmployeeMgmt/WelcomAdmin.jsp'>Go Back</button> </h3>"
	                        + "</body></html>"); 
		}
		
	}

}
