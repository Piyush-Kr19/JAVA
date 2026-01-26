/*Create a banking system with one interface and three classes i.e., IAccount,
Bank, SavingsAccount, and CurrentAccount. The bank should have a list of
accounts and methods for adding them. IAccounts should be an interface
with methods to deposit, withdraw, calculate interest, and view balances.
SavingsAccount and CurrentAccount should implement the IAccount
interface and have their own unique methods */


import java.util.ArrayList;
import java.util.Scanner;

interface IAccount{

    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void balances();
}

class SavingsAccount implements IAccount{

    private double balance;
    private static final double interest = 0.04;

    SavingsAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    
    public void withdraw(double amount){
        if(balance - amount >= 1000){
            balance -= amount;
        }
        else{
            System.out.println("Minimum balance of 1000 is required.");
        }
    }

    public double calculateInterest() {
        return balance * interest;
    }

    public void balances() {
        System.out.println("Savings Account Balance: " + balance);
    }

    public void addMonthlyInterest() {
        balance += calculateInterest();
    }
}

class CurrentAccount implements IAccount{

    private double balance;
    private static final double overdraftLimit = 5000;

    CurrentAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance - amount >= -overdraftLimit){
            balance -= amount;
        }
        else{
            System.out.println("Overdraft limit exceeded.");
        }
    }

    public double calculateInterest() {
        return 0; // No interest for current account
    }

    public void balances() {
        System.out.println("Current Account Balance: " + balance);
    }

    public void checkOverdraftLimit() {
        System.out.println("Overdraft limit: " + overdraftLimit);

    }

}


class Bank {

    private ArrayList<IAccount> accounts = new ArrayList<>();

    public void addAccount(IAccount account) {
        accounts.add(account);
    }

    public void showAllAccounts() {
        for (IAccount ac : accounts) {
            ac.balances();
        }
    }
}



public class Driver2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Bank bank = new Bank();

        // Savings Account
        System.out.print("Enter initial balance for Savings Account: ");
        IAccount sa = new SavingsAccount(s.nextDouble());

        System.out.print("Enter amount to deposit (Savings): ");
        sa.deposit(s.nextDouble());

        System.out.print("Enter amount to withdraw (Savings): ");
        sa.withdraw(s.nextDouble());

        bank.addAccount(sa);

        // Current Account
        System.out.print("Enter initial balance for Current Account: ");
        IAccount ca = new CurrentAccount(s.nextDouble());

        System.out.print("Enter amount to deposit (Current): ");
        ca.deposit(s.nextDouble());

        System.out.print("Enter amount to withdraw (Current): ");
        ca.withdraw(s.nextDouble());

        bank.addAccount(ca);

        // Display all accounts
        bank.showAllAccounts();
    }
}
