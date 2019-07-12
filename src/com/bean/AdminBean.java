package com.bean;
import com.databse.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.databse.DatabaseConnector;

public class AdminBean {
	private String name;

	public boolean verifyAdmin(String username,String password) 
	{
		boolean flag = false;
		try {
			 Connection con = DatabaseConnector.initializeDatabase(); 
			  
	         // Create a SQL query to insert data into demo table 
	         // demo table consists of two columns, so two '?' is used 
			 
	         PreparedStatement st = con.prepareStatement("select passwordi,role from admindetails where username = ?");
	         st.setString(1,username);
	         ResultSet rs = st.executeQuery();
	         String ad ="admin";
	         if(rs.next()) 
	         {
	        	 if(password.equals(rs.getString(1))) {
		        	 if(ad.equalsIgnoreCase(rs.getString(2))) 
		        	 {
		        		 flag = true;
		        	 }
		        	 
	         }
	        	 }
	}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		return flag;
		}
}
