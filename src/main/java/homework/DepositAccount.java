package homework;

import java.time.LocalDate;
import java.util.Date;

public class DepositAccount extends AbstractAccount{
    private double balance;
    private LocalDate lastWithdrawalDate;
    private LocalDate now = LocalDate.now();
    public DepositAccount(int balance) {
        super(balance);
    }


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
        if (this.lastWithdrawalDate.isBefore(this.now.minusMonths(1))){
            if (withdrawal > 0 && balance >= withdrawal) {
                this.balance -= withdrawal * 1.01 ;
                lastWithdrawalDate = LocalDate.now();
            } else {
                throw new IllegalArgumentException("Некорректная сумма снятия или на счете недостаточно средств");
            }
        }
        else {
            throw new IllegalArgumentException("Нельзя снимать средства чаще, чем раз в месяц");
        }
    }

}
