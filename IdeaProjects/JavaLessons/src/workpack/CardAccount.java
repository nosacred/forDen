package workpack;

public class CardAccount extends BankAccount {
    public CardAccount(double x) {
        super(x);
    }

    @Override
    public void dropMoney(double amount) {
        if(getBalance() >= amount*1.01){
            super.dropMoney(amount);
            super.dropMoney(amount*0.01);
        }
    }
}
