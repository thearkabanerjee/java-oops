package question4;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder,double balance ){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance +amount;

    }
    public void withdraw(double amount){
        balance = balance - amount;

    }

    public double getBalance(){
        return balance;
    }

    public String nameaccount(){
        return accountHolder;
    }

}