import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) throws Exception {       // to handle the throw exception of the withdraw method.
        SavingAccount account = new SavingAccount();
        System.out.println("Select 1 for withdraw 2 for deposite.");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
        if(ch == 1){
            System.out.println("Enter amount :");
            double amnt = s.nextDouble();
            account.withdraw(amnt);
        } else if(ch == 2){
            System.out.println("Enter amount :");
            double amnt  = s.nextDouble();
            double finalbalance  = account.deposit(amnt);
            System.out.println("Your balance is :" + finalbalance);
        }

    }
}

class SavingAccount{
    private long id ;
    private double balance ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) throws Exception {
        if(amount > balance && balance <=0 ){
            throw new Exception("InsufficientBalanceException");
        }
        else if(amount < 0 ){
            throw new Exception("IllegalBankTransactionException");
        }
        else{
            balance -= amount;
        }


        return amount;

    }

    public double deposit(double amount){
        setBalance(balance += amount);

        return getBalance();

    }

}
