package Package_03.abstraction;

public class AbstractionDemo  {
    public static void main(String[] args) {

        SavingsAccount savingsAccount=new SavingsAccount("nskjdfhfn",100);
        savingsAccount.deposit(100);

        BankAccount savingsAccount1=new SavingsAccount("dbweiuf",500);
        savingsAccount1=new CurrentAccount("cnowihjfmw",900);
        savingsAccount1.deposit(200);

        System.out.println(savingsAccount1.getAccountNumber());
        savingsAccount1=new SavingsAccount("SAVING",1000);
        System.out.println(savingsAccount1.getAccountNumber());
    }
}
