package Logic;
public class Customer{
    private  String firstname, lastname, username="", password = "";
    private int customerID, accountID, currentBalance, phoneNumber; //use phone number in case they want to reset the password
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
    
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    public int getCustomerID(){
        return this.customerID;
    }


    public void setAccountID(int accountID){
        this.accountID = accountID;
    }

    public int getAccountID(){
        return this.accountID;
    }
    
    public void setStatus(boolean isActive){
        this.status = isActive;
    }

    public boolean getStatus(){
        return this.status;
    }

    public int getCurrentBalance(){
        return this.currentBalance;
    }

    public void deposit(int amount){
        this.currentBalance = this.currentBalance + amount;
    }

    public boolean withdraw(int amount){
        if(this.currentBalance >= amount){
            this.currentBalance = this.currentBalance - amount;
            return true;
        }
        return false;

    }


}