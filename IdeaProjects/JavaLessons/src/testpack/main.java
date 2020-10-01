package testpack;

import workpack.BankAccount;
import workpack.CardAccount;
import workpack.DepositAccount;

public class main {
    public static void main(String[] args) {
        BankAccount deposit1 = new DepositAccount(5000);
        BankAccount card1 = new CardAccount(300);

        System.out.println(deposit1.getBalance());
        System.out.println(card1.getBalance());
        System.out.println(deposit1.sendMoney(card1, 1000));

        card1.sendMoney(deposit1,5000);
        deposit1.getMoney(500);

        System.out.println(deposit1.getBalance());
        System.out.println(card1.getBalance());
        System.out.println(deposit1.sendMoney(card1, 1000));

        System.out.println(deposit1.getBalance());
        System.out.println(card1.getBalance());
    }
}
