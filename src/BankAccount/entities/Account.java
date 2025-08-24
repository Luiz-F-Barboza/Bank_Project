package BankAccount.entities;

public class Account {
    public int AccountNumber;
    public String holder;
    public double balance;

    public Account(int AccountNumber, String holder, double initialDeposit){
        this.AccountNumber = AccountNumber;
        this.holder = holder;
        if(initialDeposit > 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0.0;
        }
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= (amount + 5);
    }

    public String toString(){
        return "Account data: \n"
                + " Owner of account: " + holder + "\n"
                + " Account number: " + AccountNumber + "\n"
                + " Account balance: $" + String.format("%.2f", balance) + "\n";
    }
}
