package Logic;

import java.util.ArrayList;

public class Customer{
    private  String customerID, accountID, firstname, lastname, username="", password = "";
    private  int phoneNumber; //use phone number in case they want to reset the password
    private boolean status;


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
    
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public String getCustomerID(){
        return this.customerID;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public boolean checkIfCustomerHasAccountByID(String accountID){

        if(this.accountID == accountID){
            return true;
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