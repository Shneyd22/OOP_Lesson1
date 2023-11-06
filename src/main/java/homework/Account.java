package homework;

public interface Account {
    double getAmount();

    void put (double balance, double deposit);

    void take (double balance, double deposit);
}