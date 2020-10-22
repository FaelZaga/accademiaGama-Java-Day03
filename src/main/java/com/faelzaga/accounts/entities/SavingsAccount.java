package main.java.com.faelzaga.accounts.entities;

public class SavingsAccount extends Account {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public String getType() {
        return "SavingsAccount";
    }
}
