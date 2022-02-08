package Logic;

import java.util.ArrayList;
import java.util.HashMap;

public class Administrator {
    
    private static ArrayList<Integer> allAccounts = new ArrayList<>();

    // add user method
    public static void addCustomer(){

    }

    public static Account getAccountByID(int accountID){
        for(Account account : allAccounts){
            if(account.getAccountID() == accountID){
                return account;
            }
        }
        //account does not exist
        return null;
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
                 setAccountBalanceByID(accountIDFrom, transferFrom.getCurrentBalance());
                 setAccountBalanceByID(accountIDTo, transferTo.getCurrentBalance());


                 // update Accouts in customers table

                return 1;


            }else{
                return -1;
            }
        }
        return 0;
    }
    


    public static void setAccountBalanceByID(int accountID, int currentBalance){
        for(Account account : allAccounts){
            if(account.getAccountID() == accountID){
                account.setCurrentBalance(currentBalance);
            }
        }
    }

}
