package question4B;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        // this.balance  = balance;

    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
}

