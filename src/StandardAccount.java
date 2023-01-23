public class StandardAccount implements IAccount {

    //State
    int AccountNumber;
    double creditlimit;
    double balance;

    //Constructor
    public StandardAccount(int accountNumber, double creditlimit){
        this.AccountNumber = accountNumber;
        this.creditlimit = creditlimit;
        balance = 0;


    }


    //Behavior
    @Override
    public void Deposit(double amount) {
        balance += amount;

    }

    @Override
    public double Withdraw(double amount) {
        if (balance >= amount) {
                return amount;
        } else if (creditlimit == balance) {
                return 0;
        } else { double X = balance - creditlimit;
                balance -= X;
                        return X;}


    }

    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return AccountNumber;
    }
}
