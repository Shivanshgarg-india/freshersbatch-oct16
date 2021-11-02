class TotalCash {
    public static void main(String[] args) {
        Savingaccount savingaccount = new Savingaccount();
        CurrentAccount currentAccount = new CurrentAccount();
        double totalcash = savingaccount.TotalMoney()+currentAccount.TotalMoney();
        System.out.println("Total cash in bank is "+ totalcash);

    }
}

public class Bank {
    public double TotalMoney(){
        return 0.0;
    }
}

class Savingaccount extends Bank{
    private double fixedDeposit = 90000;

    public double getFixedDeposit() {
        return fixedDeposit;
    }

    @Override
    public double TotalMoney() {
        return fixedDeposit;
    }
}

class CurrentAccount extends Savingaccount {
    private double cashCredit = 2000;

    public double getCashCredit() {
        return cashCredit;
    }

    @Override
    public double TotalMoney() {

        return cashCredit;
    }
}
