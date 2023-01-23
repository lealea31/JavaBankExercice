public class BasicAccount implements IAccount{


    //State
    int AccountNumber;
    double withdrawalLimit;
    double balance;

    //Constructor
    public BasicAccount(int accountNumber, double withdrawalLimit){
        this.AccountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
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
        } else if (amount > 100) {
            amount = 100;
            return amount;
        } else if (withdrawalLimit == balance) {
            return 0;
        } else { double X = balance - withdrawalLimit;
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
