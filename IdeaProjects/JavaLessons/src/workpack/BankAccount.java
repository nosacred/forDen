package workpack;

public class BankAccount {
    private double balance = 0;
    BankAccount(double x){
        balance= x;
    }

    public void putMoney(double amount){
        balance+= amount;
    }

    public void dropMoney(double amount){
        if(balance >= amount){
            balance-=amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean sendMoney(BankAccount client, double amount){
        if (balance >= amount){
            balance-=amount;
            client.putMoney(amount);
            System.out.println("Произошло списание денежных средств в размере: "+ amount);
            return true;
        }
        else System.out.println(" На вашем счете недостаточно средств для совершения данной операции! Пополните баланс");
        return false;
    }

}



