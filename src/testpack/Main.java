package testpack;

import workpack.BankAccount;
import workpack.CardAccount;
import workpack.DepositAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount deposit1 = new DepositAccount(5000);
        BankAccount card1 = new CardAccount(12300);

        System.out.println(deposit1.getBalance());
        System.out.println(card1.getBalance());
        System.out.println(deposit1.sendMoney(card1, 1000));

        card1.sendMoney(deposit1,-5345.54);
        deposit1.putMoney(500);
        deposit1.putMoney(-5000.67);
        deposit1.takeMoney(-500);

        System.out.println(deposit1.getBalance());
        System.out.println(card1.getBalance());
        System.out.println(deposit1.sendMoney(card1, 1000));

        System.out.println(deposit1.getBalance());
        System.out.println(card1.getBalance());
    }
}
