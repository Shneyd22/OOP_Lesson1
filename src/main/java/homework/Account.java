package homework;

public class Account {
    private int amount;

    public Account(int amount) {
        this.amount = 0;
    }

    public void put(int amount, int deposit) {
        if (deposit > 0) {
            this.amount = amount;
            amount += deposit;
        } else {
            throw new IllegalArgumentException("Сумма внесения должна быть положительной");
        }
    }

    public void take(int amount, int withdrawal) {
        if (withdrawal > 0) {
            this.amount = amount;
            amount -= withdrawal;
        } else {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
    }

    public int getAmount() {
        return amount;
    }
}