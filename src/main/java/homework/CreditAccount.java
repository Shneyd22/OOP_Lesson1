package homework;

public class CreditAccount extends Account{
    public CreditAccount(int amount) {
        super(amount);
    }

    @Override
    public void take(int amount, int withdrawal) {
        amount -= withdrawal * 1.01;
    }

}
