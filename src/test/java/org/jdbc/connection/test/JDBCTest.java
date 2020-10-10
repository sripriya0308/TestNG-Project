package org.jdbc.connection.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
	
	Connection con=null;
	
	try {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","srithala");
	String sql= "Select * from Register";
	PreparedStatement ps=con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		
		
		String fname=rs.getString("firstname");
		String lname=rs.getString("lastname");
		String adrs=rs.getString("Address");
		String email=rs.getString("email");
		long pn=rs.getLong("phone");
		String gen=rs.getString("gender");
		String hb=rs.getString("hobbies");
		String sk=rs.getString("skills");
		String coun=rs.getString("country");
		Date dob=rs.getDate("DOB");
		String pw=rs.getString("password");
		String confpw=rs.getString("confirmpassword");
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(adrs);
		System.out.println(email);
		System.out.println(pn);
		System.out.println(gen);
		System.out.println(hb);
		System.out.println(sk);
		System.out.println(coun);
		System.out.println(dob);
		System.out.println(pw);
		System.out.println(confpw);
		
		
	}
	}
	
	
	finally {
	
	con.close();
	
	}
	
	
	}
	

}
