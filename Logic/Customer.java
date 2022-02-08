package Logic;

import java.util.ArrayList;

public class Customer{
    private  String firstname, lastname, username="", password = "";
    private int customerID, phoneNumber; //use phone number in case they want to reset the password
    private boolean status;
    private ArrayList<Integer> customerAccountsIDs = new ArrayList<>(); // a customer can have multiple accounts

    public Customer(String firstname, String lastname, int phoneNumber, String username, String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }
    

    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }
    
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    
    public void setUserName(String username){
        this.username = username;
    }
    

    public String getUsername(){
        return this.username;
    }
    


    public void setPassword(String password){
        this.password = password;
    }
    

    public String getPassword(){
        return this.password;
    }
    
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    public int getCustomerID(){
        return this.customerID;
    }


    public void addAccountID(int accountID){
        this.customerAccountsIDs.add(accountID);
    }

    public boolean checkIfCustomerHasAccountByID(int accountID){
        for(int id : customerAccountsIDs){
            if(id == accountID){
                return true;
            }
        }

        return false;
    }
    
    public void setStatus(boolean isActive){
        this.status = isActive;
    }

    public boolean getStatus(){
        return this.status;
    }




}