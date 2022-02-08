package Logic;

import java.util.ArrayList;
import java.util.HashMap;

public class Administrator {
    
    private static ArrayList<Integer> allAccounts = new ArrayList<>();

    // add user method
    public static boolean addCustomer(String customerID, String firstname, String lastname, int phoneNumber, String username, String password){
       Customer customer = new Customer(customerID, firstname, lastname, phoneNumber, username, password);
       return SQLConnector.insertCustomer(customer);

    }

    public static Account getAccountByID(String accountID){
         return SQLConnector.getAccountByID(accountID);
    }

    public static boolean updateAccountBalance(String accountID, int balance){
           return SQLConnector.updateAccountBalance(accountID, balance);
    }

    //if this method returns 0 it means one of the given accountIDs does not exist
    //if it returns -1 it means the first account does not have enough balance
    //if it returns 1 it means the transaction was successful
    public static int trasferTo(String accountIDFrom, String accountIDTo, int amount){
        Account transferFrom = getAccountByID(accountIDFrom);
        Account transferTo = getAccountByID(accountIDTo);

        if(transferFrom != null && transferTo != null){
            if(transferFrom.getCurrentBalance() >= amount){
                //remove amount from the balance
                transferFrom.withdraw(amount);

                //add amount to balance
                transferTo.deposit(amount);


                 // update account data on the table
                 updateAccountBalance(accountIDFrom, transferFrom.getCurrentBalance());
                 updateAccountBalance(accountIDTo, transferTo.getCurrentBalance());


                 // update Accouts in customers table

                return 1;


            }else{
                return -1;
            }
        }
        return 0;
    }
    




}
