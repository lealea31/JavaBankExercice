import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
    List<IAccount> theList;
    public Bank() {
        this.theList = new ArrayList<>();
    }
    @Override
    public void OpenAccount(IAccount account) {
        this.theList.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        for(int i = 0; i < this.theList.size(); i++) {
            int currentANValue = this.theList.get(i).GetAccountNumber();
            if (currentANValue == accountNumber) {
                double currentBalance = this.theList.get(i).GetCurrentBalance();
                if(currentBalance >= 0) {
                    this.theList.remove(i);
                } else {
                    System.out.println("The account is not closed due to debt");
                }
                break;
            }
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return this.theList;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> debt = new ArrayList<>();
        for (int i = 0; i < this.theList.size(); i++) {
            if (this.theList.get(i).GetCurrentBalance() < 0) {
                debt.add(this.theList.get(i));
            }
        }
        return debt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> above = new ArrayList<>();
        for (int i = 0; i < this.theList.size(); i++) {
            if (this.theList.get(i).GetCurrentBalance() > balanceAbove) {
                above.add(this.theList.get(i));
            }
        }
        return above;
    }
}