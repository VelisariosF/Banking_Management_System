package Logic;

public class Account {
    private String customerID, accountID;
    private int currentBalance;
    
    public Account(String accountID, String custommerID, int currentBalance){
        this.accountID = accountID;
        this.customerID = custommerID;
        this.currentBalance = currentBalance;
    }
    

    
    public String getAccountID(){
        return this.accountID;
    }

    public void setCurrentBalance(int amount){
        this.currentBalance = amount;
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
