package com.control;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.*;
import com.databse.*;

public class EmpDaoImple implements EmpDAO {
	
	
	
	
	@Override
	public boolean insert(Employee e) {
		boolean flag = false;
		try {
			 Connection con = DatabaseConnector.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("insert into admindetails (username,passwordi,role) values(?,?,?)");      
			 st.setString(1,e.getUsernamei());
			 st.setString(2,e.getPasswordi());
			 st.setString(3,e.getRolei());
			 
			 st.executeUpdate(); 
	         st.close(); 
	         con.close(); 
	         flag = true;
		}
		catch(Exception E) 
		{
			System.out.println(E);
		}
		return flag;
	}
	@Override
	public boolean update(Employee e) {
		boolean flag = false;
		try {
			 Connection con = DatabaseConnector.initializeDatabase();
			 PreparedStatement st = con.prepareStatement("UPDATE admindetails SET role = ? WHERE username =?");      
			 st.setString(1,e.getRolei());
			 st.setString(2, e.getUsernamei());
			 
			 
			 st.executeUpdate(); 
			 
	         st.close(); 
	         con.close(); 
	         flag = true;
		}
		catch(Exception E) 
		{
			System.out.println(E);
		}
		return flag;
	}
	
	@Override
	public boolean display(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Employee e) {
		
			boolean flag = false;
			try {
				 Connection con = DatabaseConnector.initializeDatabase();
				 PreparedStatement st = con.prepareStatement("DELETE FROM admindetails WHERE username =?");      
				 st.setString(1,e.getUsernamei());
				 
				 
				 st.executeUpdate(); 
		         st.close(); 
		         con.close(); 
		         flag = true;
			}
			catch(Exception E) 
			{
				System.out.println(E);
			}
			return flag;
		}
	}
	

