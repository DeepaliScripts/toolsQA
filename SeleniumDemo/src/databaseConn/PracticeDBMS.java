package databaseConn;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;



public class PracticeDBMS {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		String dbURL = "jdbc:mysql://localhost:3306/";
		String uID ="root";
		String pwd = "Deepali6997@";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		DriverManager.getConnection(dbURL, uID, pwd);

	}

}
