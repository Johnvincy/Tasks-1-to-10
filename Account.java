package Guvijavacodes;

public class Account {
		    private double balance;

		    // Constructor with no arguments
		    public Account() {
		        // Default balance is set to 0 if no value is provided
		        this.balance = 0.0;
		    }

		    // Constructor with one argument to set the initial balance
		    public Account(double balance) {
		        // Setting the balance using the provided value
		        this.balance = balance;
		    }

		    // Method to withdraw money from the account
		    public void withdraw(double amount) {
		        if (amount > 0 && amount <= balance) {
		            balance -= amount;
		            System.out.println("Withdrawal successful. Remaining balance: " + balance);
		        } else {
		            System.out.println("Invalid withdrawal amount or insufficient balance.");
		        }
		    }

		    // Method to deposit money into the account
		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            System.out.println("Deposit successful. New balance: " + balance);
		        } else {
		            System.out.println("Invalid deposit amount.");
		        }
		    }

		    // Getter method to retrieve the balance
		    public double getBalance() {
		        return balance;
		    }

		    // Setter method to set the balance
		    public void setBalance(double balance) {
		        this.balance = balance;
		    }

		    // Main method to test the Account class
		    public static void main(String[] args) {
		        // Creating an account object using the default constructor
		        Account account1 = new Account();
		        System.out.println("Account 1 Balance: " + account1.getBalance());

		        // Depositing and withdrawing money from the account
		        account1.deposit(100.0);
		        account1.withdraw(50.0);

		        // Creating an account object using the constructor with one argument
		        Account account2 = new Account(500.0);
		        System.out.println("Account 2 Balance: " + account2.getBalance());

		        // Depositing and withdrawing money from the account
		        account2.deposit(200.0);
		        account2.withdraw(300.0);
		    }
		}

