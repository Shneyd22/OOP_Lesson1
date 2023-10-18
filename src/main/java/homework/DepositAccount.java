package homework;

import java.time.LocalDate;
import java.util.Date;

public class DepositAccount extends Account{
    private LocalDate lastWithdrawalDate;
    private LocalDate now = LocalDate.now();
    public DepositAccount(int amount) {
        super(amount);
    }

    @Override
    public void take(int amount, int withdrawal, LocalDate now, LocalDate lastWithdrawalDate) {
        if (lastWithdrawalDate.isBefore(now.minusMonths(1))){
            super.take(amount, withdrawal);
            lastWithdrawalDate = LocalDate.now();
        }
        else {
            throw new IllegalArgumentException("Нельзя снимать средства чаще, чем раз в месяц");
        }
    }
}
