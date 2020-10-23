package main.java.com.faelzaga.accounts.entities;

public class SavingsAccount extends Account {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public String getType() {
        return "SavingsAccount";
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
