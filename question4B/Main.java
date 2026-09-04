package question4B;

public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Arka banerjee");
        account.deposit(10000);
        account.withdraw(2500);
        account.deposit(500);   
        System.out.println(account.getBalance() + " " + account.getAccountHolder());
    }
}
