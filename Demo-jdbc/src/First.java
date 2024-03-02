import java.sql.*;
import java.util.Scanner;
public class First {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded....");
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/table1","root","root");
		System.out.println("Connection Obtained...");
		Statement stmt=con.createStatement();
		String sql="insert into student values(200,'abc')";
		stmt.executeUpdate(sql);
		con.close();
	}
}
