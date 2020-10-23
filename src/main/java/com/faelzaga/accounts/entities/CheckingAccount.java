package main.java.com.faelzaga.accounts.entities;

public class CheckingAccount extends Account {

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(0.1 - amount);
        }
    }

    public String getType() {
        return "CheckingAccount";
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + getName() + '\'' +
                ", balance=" + getBalance() +
                ", type=" + getType() +
                '}';
    }
}
