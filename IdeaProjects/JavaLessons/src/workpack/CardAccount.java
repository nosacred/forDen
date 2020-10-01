package workpack;

public class CardAccount extends BankAccount {
    public CardAccount(double x) {
        super(x);
    }

    @Override
    public boolean sendMoney(BankAccount client, double amount) {
        if (getBalance() >= amount + (amount * 0.99)) {
            super.sendMoney(client, amount);
            super.getMoney(-0.01 * amount);
            return true;
        } else return false;
    }

//    boolean sendMoney(double amount) {
//        if (getBalance() >= amount * 1.01) {
//            super.getMoney(-amount * 1.01);
//            return true;
//        } else return false;
//    }
//}
}
