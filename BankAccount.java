import java.util.ArrayList;

public class BankAccount {
    //member variables - attributes - field 
    public String name; 
    public double checking;
    public double saving;
    // public ArrayList<Account> accounts = new ArrayList<>();
    public static int numbersOfAccounts =0;
    public static double total = 0;
    
    //constructor 
    public BankAccount(String name) {
        this.name = name;
        this.checking = 5;
        this.saving = 5;
        this.numbersOfAccounts++;

    }

    public void testing(){
        System.out.println("Testing");
    }

    public void numbersOfAccounts(){
        // this.accounts.add();
        this.checking ++;
        this.saving ++;
    }

    public void addToAccounts(){
        // this.accounts.add();
        this.checking++;
        this.saving++;
        // System.out.println("Test");
    }  

    // public void displayAccounts(){
    //     System.out.println("name: " + this.name);
    //     System.out.println("checking: " + this.checking);
    //     System.out.println("saving: " + this.saving);
    //     for(Account account : this.accounts) {
    //         System.out.println("Accounts " + account.name);
    //     }
    // }
    
    public double getChecking(){
        return checking;

    }

    public double getSaving(){
        return saving;
    }

    // public String getNumbersOfAccount(){
    //     return numbersOfAccounts;
    // }

    public void depositChecking(double amount) {
        checking += amount;
        
    }  
    
    public void depositSaving(double amount) {
        saving += amount;
    }

    public void withdrawChecking(double amount){
        if(getChecking() > amount){
            checking -= amount;
        }
        System.out.println("insufficient funds");

    }

    public void withdrawSaving(double amount){
        if(getSaving() > amount){
            saving -= amount;
        }
        System.out.println("insufficient funds");

    }

    public double getTotal() {
        double total = getChecking() + getSaving();
        return total;
    }

    




   
}