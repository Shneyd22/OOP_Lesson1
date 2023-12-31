package homework;

public class CreditAccount extends AbstractAccount {
    public CreditAccount(double balance) {
        super(balance);
    }
    private double balance;

    @Override
    public double getAmount() {
        return this.balance;
    }

    @Override
    public void put(double balance, double deposit) {
        if (deposit > 0) {
            this.balance += deposit;
        } else {
            throw new IllegalArgumentException("Сумма внесения должна быть положительной");
        }
    }
    @Override
    public void take(double balance, double withdrawal) {
        if (withdrawal > 0 && balance >= withdrawal) {
            this.balance -= withdrawal * 1.01 ;
        } else {
            throw new IllegalArgumentException("Некорректная сумма снятия или на счете недостаточно средств");
        }
    }
}
