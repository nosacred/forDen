package workpack;

public class BankAccount {

    private double balance;

    BankAccount(double x){
        balance= x;
    }

    public void putMoney(double amount){
        balance+= Math.abs(amount);
    }

    public void takeMoney(double amount){
        if(balance >= amount){
            balance-=Math.abs(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean sendMoney(BankAccount client, double amount){
        if (balance >= amount){
            takeMoney(amount);
            client.putMoney(amount);
            System.out.println("Произошло списание денежных средств в размере: "+ Math.abs(amount));
            return true;
        }
        else System.out.println("На вашем счете недостаточно средств для совершения данной операции! Пополните баланс");
        return false;
    }

}



