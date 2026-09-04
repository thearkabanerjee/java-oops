package question4;

public class Main {
    public static void main(String args[]){
        
        BankAccount bankaccount = new BankAccount("Arka", 0);
        bankaccount.deposit(5000);
        bankaccount.withdraw(1000);
        System.out.println(bankaccount.getBalance());
        System.out.println(bankaccount.nameaccount());
        
    }
}
