public class BankAccount {
    //instance variables
    private String name; //can only be accessed within the BankAccount class
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;

    //constructor    
    //the job of the constructor is to set the instance variables to valid values
    public BankAccount(String name, int accountNum, double balance, String password) {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
        this.password = password;
        this.loggedIn = false;

    }

    //mutator method - a method whose job is to change the value of a private instance variable
    public boolean logIn(String name, String password) { //public means you can access this method outside of the class
        if (name.equals(this.name) && password.equals(this.password)) {
            this.loggedIn = true;
            return true;
        }

        else {
            return false;
        }
    }

    public void logOut() { //void means this method doesn't give back an answer
        loggedIn = false;
    }

    //accessor method - gives access to a private instance variable
    public double getBalance() {
        if (loggedIn == true) {
            return balance;
        }
        else {
            throw new IllegalStateException("Not logged in."); //generates an error
        }
    }

    public double deposit(double amount) { //public so it can be accessed through ATM software
        if (loggedIn == true) {
            balance += amount;
            return balance;
        }
        else {
            throw new IllegalStateException("Not logged in."); 
        }
    }

    public double withdraw(double amount) {
        if (loggedIn == true) {
            if (balance < amount) {
                throw new IllegalStateException("Withdrawl amount is greater than total balance.");
            }
            else {
                balance -= amount;
                return balance;
            }
        }
        else {
            throw new IllegalStateException("Not logged in."); 
        }
    }

    public String toString() { //overrides toString
        return "Account Number: " + this.accountNum;
    }         
}
