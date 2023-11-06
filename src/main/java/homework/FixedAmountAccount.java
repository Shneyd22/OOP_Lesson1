package homework;

public class FixedAmountAccount extends AbstractAccount{

    private double balance;
    public FixedAmountAccount (double balance) {
        super(balance);
    }
    @Override
    public double getAmount() {
        return this.balance;
    }

    @Override
    public void put(double balance, double deposit) {
        if (deposit > 0) {
            System.out.printf("%s успешно внесены на счет", deposit);
        } else {
            throw new IllegalArgumentException("Сумма внесения должна быть положительной");
        }
    }
    @Override
    public void take(double balance, double withdrawal) {
        if (withdrawal > 0) {
            System.out.printf("%s успешно сняты со счета", withdrawal);
        } else {
            throw new IllegalArgumentException("Некорректная сумма снятия");
        }
    }


}
