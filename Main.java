



import GUI.*;
import Logic.Customer;
import Logic.SQLConnector;


public class Main{
    public static void main(String[] args){
        //Test Class
        Customer c = new Customer("cs09882", "nikos", "Fafoutis", 9595959, "nik", "1234");

       if( SQLConnector.insertCustomer(c)){
           System.out.println("tru cccce");

       }else{
           System.out.println("false");
        }
    }
    }
