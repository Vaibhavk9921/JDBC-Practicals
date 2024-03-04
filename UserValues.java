import java.sql.*;
import java.util.Scanner;
public class UserValues {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded....");
        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        String choice;
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/table1","root","root");
        System.out.println("Connection Obtained...");
        Statement stmt=con.createStatement();
        do {
        System.out.println("Enter id and Name");
        id=sc.nextInt();
        name=sc.next();
        String sql="insert into student values("+id+",'"+name+"')";
        stmt.executeUpdate(sql);
        System.out.println("Record inserted....");
        System.out.println("Do You Want to continue(y/n)");
        choice=sc.next();
        }while(choice.equals("y"));
        con.close();
	}
}
