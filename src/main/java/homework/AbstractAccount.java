package homework;

public abstract class AbstractAccount implements Account {
 private double balance;

 public AbstractAccount(double balance) {
     this.balance = 0;
 }
    public abstract void put(double balance, double deposit);

    public abstract void take(double balance, double withdrawal);

    public double getAmount(double balance){
        this.balance = balance;
        return balance;
    }
}
