public class PremiumAccount implements IAccount{

    //State
    int AccountNumber;
    double withdrawalLimit;

    double balance;

    //Constructor
    public PremiumAccount(int accountNumber) {
        this.AccountNumber = accountNumber;
    }



    //Behavior
    @Override
    public void Deposit(double amount) {
        balance += amount;

    }

    @Override
    public double Withdraw(double amount) {
        balance -= amount;
        return amount;


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
