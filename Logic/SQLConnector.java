package Logic;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class SQLConnector {

    private static final String DATABASE_NAME = "jdbc:mysql://localhost:3306/banking_system";
    private static final String DATABASE_USERNAME = "velisarios";
    private static final String DATABASE_PASSWORD = "pataros16";
    private static final String CUSTOMERS_TABLE = "customers";
    private static final String ACCOUNTS_TABLE = "accounts";





    public static boolean insertCustomer(Customer customer){
        boolean flag = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement stmt = con.createStatement();
            //write query
            String query = "INSERT INTO "+ CUSTOMERS_TABLE +"(customerID, firstname, lastname, phoneNumber, username, password)"
                    + " VALUES ('" + customer.getCustomerID() +"', '" + customer.getFirstname() +"', '" + customer.getLastname() +"', "
                    + customer.getPhoneNumber() +", '" + customer.getUsername() +"', '" + customer.getPassword() + "')";
            stmt.execute(query);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }


    public static Account getAccountByID(String accID) {
        Account account = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD);
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            //write query
            String query = "SELECT * FROM "+ ACCOUNTS_TABLE +" WHERE accountID = '" + accID +"'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String accountID = rs.getString("accountID");
                String customerID = rs.getString("customerID");
                int balance = rs.getInt("balance");
                account = new Account(accountID, customerID, balance);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return  account;
    }

    public static boolean updateAccountBalance(String accID, int balance){
        int flag = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    DATABASE_NAME, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement stmt = con.createStatement();
            //write query
            String query = "UPDATE "+ ACCOUNTS_TABLE +" SET balance = " + balance + " WHERE accountID = '" + accID +"'";
            flag= stmt.executeUpdate(query);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        if(flag == 0){
            return false;
        }
        return true;
    }



}
