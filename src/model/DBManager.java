package model;
import java.sql.*;

public class DBManager {
	public static Connection getConnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/prep","root","root");
	}
}
