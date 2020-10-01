package workpack;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    public DepositAccount(int x) {
        super(x);
    }

    private LocalDate lastPlus = LocalDate.of(2020, 8, 1);


    @Override
    public void putMoney(double amount) {
        super.putMoney(amount);
        lastPlus = LocalDate.now();
    }

    @Override
    public void takeMoney(double amount) {
        LocalDate now = LocalDate.now();
        if (now.isAfter(lastPlus.plusMonths(1))) {
            super.takeMoney(amount);
        }
    }

    @Override
    public boolean sendMoney(BankAccount client, double amount) {
        LocalDate now = LocalDate.now();
        if (now.isAfter(lastPlus.plusMonths(1))) {
            return super.sendMoney(client, amount);
        } else
            System.out.println("Вы не можете снимать деньги в течние месяца!");
        return false;
    }
}