import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class BankAccount {
    private double balance = 0;
    BankAccount(double x){
        balance= x;
    }
    void getMoney(double amount){balance+= amount;}
    void getMoney ( BankAccount client, double  amount) {
        balance += amount;
        System.out.println("Ваш Баланс пополнен! Зачислено " + amount);
    }
    boolean sendMoney( BankAccount client, double amount ){
        if (balance >= amount){
            balance-=amount;
            client.getMoney(client, amount);
            System.out.println("Произошло списание денежных средств в размере: "+ amount);
            return true;
        }
        else System.out.println(" На вашем счете недостаточно средств для совершения данной операции! Пополните баланс");
        return false;
    }
    double getBalance() {return balance;}
}

class DepositAccount extends BankAccount{

    DepositAccount(int x) {
        super(x);
    }
    LocalDate lastPlus = LocalDate.of(2020,8,1);
    LocalDate now;

    @Override
    void getMoney(double amount) {
        super.getMoney(amount);
        lastPlus = LocalDate.now();
    }

    @Override
    void getMoney(BankAccount client, double amount) {
        super.getMoney(client, amount);
        lastPlus = LocalDate.now();
    }

    @Override
    boolean sendMoney(BankAccount client, double amount) {
        now = LocalDate.now();
        if(now.isAfter(lastPlus.plusMonths(1))) {
           return super.sendMoney(client, amount);
        }
        else return false;
    }

}

class  CardAccount extends BankAccount{
    CardAccount(double x){
        super(x);
    }

    @Override
    boolean sendMoney(BankAccount client, double amount) {
        if(getBalance() >= amount+(amount*0.99)){
            super.sendMoney(client, amount);
            super.getMoney(-0.01*amount);
            return true;
        }
        else return false;
    }
    boolean sendMoney(double amount){
        if (getBalance() >= amount*1.01){
            super.getMoney(-amount*1.01);
            return true;
        }
        else return false;
    }
}