import java.io.Serializable;
public class savingsAccount implements Serializable{
    public static void main(String[] args) {
        //creating an instance object of the class 
        Account account = new Account(1112,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        //displaying balance, monthly interest and date of account which are the properties
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

    }
}

class Account {
    //initializing variables in no argument constructors
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }
    // Constructor with id and balance args

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
    // Accessor methods
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }
    //mutator methods

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return((4.5 / 100) / 12) ;
    }

    public double getMonthlyInterest() {
        return (balance * getMonthlyInterestRate());
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}