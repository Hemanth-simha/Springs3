package com.jspiders.MyFirstMavenProject.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MyFirstProgram {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);

			String dburl = "jdbc:mysql://localhost:3306/jspiders?user=root&password=root";
			con = DriverManager.getConnection(dburl);

			String query = " select * from studentsinfo ";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Regno : + "+rs.getInt("regno"));
				System.out.println("FirstName : + "+rs.getString("firstname"));
				System.out.println("MiddleName : + "+rs.getString("middlename"));
				System.out.println("LastName : + "+rs.getString("lastname"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
