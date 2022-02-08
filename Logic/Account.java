package Logic;

public class Account {
    private int customerID, accountID, currentBalance;
    
    public Account(int accountID, int custommerID){
        this.accountID = accountID;
        this.customerID = custommerID;
        this.currentBalance = 0;
    }
    

    
    public int getAccountID(){
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
