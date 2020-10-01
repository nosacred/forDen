package workpack;

public class CardAccount extends BankAccount {

    public CardAccount(double x) {
        super(x);
    }

    @Override
    public void takeMoney(double amount) {
        if(getBalance() >= amount*1.01){
            super.takeMoney(amount);
            super.takeMoney(amount*0.01);
        }
    }
}
