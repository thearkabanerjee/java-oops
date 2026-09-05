package question2B;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void deposit(double money){
        if (money >0) {
            balance += money;
        }
    }
    public void withdraw(double money){
        if (money >0 && money <= balance) {
            balance -= money;
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
}
