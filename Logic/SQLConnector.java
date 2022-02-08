package Logic;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class SQLConnector {

    private static final String DATABASE_NAME = "jdbc:mysql://localhost:3306/banking_system";
    private static final String DATABASE_USERNAME = "velisarios";
    private static final String DATABASE_PASSWORD = "pataros16";
    private static final String CUSTOMERS_TABLE = "customers";
    private static final String ACCOUNTS_TABLE = "accounts";


    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student3117partb","velisarios","pataros16");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from users");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }



    public Account getAccountByID(String accountID){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD);
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            //write query
           // query = "select * from accounts where "
            ResultSet rs=stmt.executeQuery("select * from users");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

}
