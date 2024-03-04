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
//		String sql="insert into student values(300,'abc')";
//		String sql="update student set name= 'pqr' where id=200" ;
		String sql="update student set name= 'xyz' where id=300" ;
		stmt.executeUpdate(sql);
		con.close();
	}
}