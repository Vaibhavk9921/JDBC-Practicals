
import java.sql.*;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int id1;
        String name1;
        int choice;
        String choice1;
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded...");
        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/table1", "root", "root");
        System.out.println("Connection Obtained...");
        Statement stmt = con.createStatement();
        do {
            System.out.println("Enter Your Choice...(1=>insert, 2=>update, 3=>delete)");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter id and name...");
                    id1 = sc.nextInt();
                    name1 = sc.next();
                    String insertSql = "INSERT INTO student VALUES (" + id1 + ", '" + name1 + "')";
                    stmt.executeUpdate(insertSql);
                    break;
                case 2:
                    System.out.println("Enter id and new name to be updated...");
                    id1 = sc.nextInt();
                    name1 = sc.next();
                    String updateSql = "UPDATE student SET name='" + name1 + "' WHERE id=" + id1;
                    stmt.executeUpdate(updateSql);
                    break;
                case 3:
                    System.out.println("Enter id to be deleted...");
                    id1 = sc.nextInt();
                    String deleteSql = "DELETE FROM student WHERE id=" + id1;
                    stmt.executeUpdate(deleteSql);
                    break;
            }
            System.out.println("Do you want to continue (y/n)?");
            choice1 = sc.next();
        } while (choice1.equalsIgnoreCase("y"));

        con.close();
        sc.close();
    }
}