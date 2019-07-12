package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.compiler.BeanRepository;
import org.apache.naming.factory.BeanFactory;
import org.apache.naming.resources.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


import com.bean.AdminBean;
import com.bean.EmpDAO;
import com.bean.Employee;

public class InsertBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public InsertBean() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		pw.println("<h1> Unauthorised Access to this Page</h1>");
		pw.println("<h3>Please <a href='LoginAdmin.html'>login</a>first</h3>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String uname =request.getParameter("f1");
		String upwd =request.getParameter("f2");
		String urole =request.getParameter("f3");
		PrintWriter  out = response.getWriter();
		
		Employee e1 = new Employee();
		e1.setUsernamei(uname);
		e1.setPasswordi(upwd);
		e1.setRolei(urole);
//		Resource resource = new ClassPathResource("Beans.xml");
//    	BeanFactory factory = new BeanFactory(resource);
//		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
//		EmpDAO ed = (EmpDAO)factory.getBean("EmpDaoID");
		EmpDAO ed = new EmpDaoImple();
		boolean signal = ed.insert(e1);
		if(signal)
		{
			
	         out.println("<html>"
	            		+ "<body><b>Successfully Inserted"
	                        + "</b>"
	                        + "<h3> Want to do it again? <button onclick=location.href='http://localhost:8080/EmployeeMgmt/WelcomAdmin.jsp'>Go Back</button> </h3>"
	                        + "</body></html>"); 
		}
	}

}
