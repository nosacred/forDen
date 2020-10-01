package workpack;

import java.time.LocalDate;

public class DepositAccount extends BankAccount{
    public DepositAccount(int x) {
        super(x);
    }
    LocalDate lastPlus = LocalDate.of(2020,8,1);
    LocalDate now;


    @Override
    public void getMoney(double amount) {
        super.getMoney(amount);
        lastPlus = LocalDate.now();
    }

    @Override
    public void getMoney(BankAccount client, double amount) {
        super.getMoney(client, amount);
        lastPlus = LocalDate.now();
    }

    @Override
    public boolean sendMoney(BankAccount client, double amount) {
        now = LocalDate.now();
        if(now.isAfter(lastPlus.plusMonths(1))) {
            return super.sendMoney(client, amount);
        }
        else return false;
    }

}
