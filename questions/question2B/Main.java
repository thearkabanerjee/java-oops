package questions.question2B;

public class Main {
    public static void main(String[] args ){
        BankAccount account = new BankAccount("Arka");
        

        account.deposit(5000);
        account.withdraw(1200);

        System.out.println(account.getBalance());
    }
}

