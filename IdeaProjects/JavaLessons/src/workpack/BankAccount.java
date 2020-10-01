package workpack;

public class BankAccount {
    private double balance = 0;
    BankAccount(double x){
        balance= x;
    }
    public void getMoney(double amount){
        balance+= amount;
    }
    public void getMoney(BankAccount client, double  amount) {
        balance += amount;
        System.out.println("Ваш Баланс пополнен! Зачислено " + amount);
    }
    public boolean sendMoney(BankAccount client, double amount){
        if (balance >= amount){
            balance-=amount;
            client.getMoney(client, amount);
            System.out.println("Произошло списание денежных средств в размере: "+ amount);
            return true;
        }
        else System.out.println(" На вашем счете недостаточно средств для совершения данной операции! Пополните баланс");
        return false;
    }
    public double getBalance() {
        return balance;
    }
}



