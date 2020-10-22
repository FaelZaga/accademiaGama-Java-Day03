package main.java.com.faelzaga.accounts;

import main.java.com.faelzaga.accounts.entities.Account;
import main.java.com.faelzaga.accounts.entities.CheckingAccount;
import main.java.com.faelzaga.accounts.entities.SavingsAccount;

public class ProgramAccount {

    public static void main(String[] args) {
        Account acc01 = new CheckingAccount("Fulano",2000.00);
        Account acc02 = new SavingsAccount("Cicrano",1200.00);

        System.out.println("Acc01: "+acc01.getType());
        System.out.println("Acc02: "+acc02.getType());

        System.out.println(acc01);
        System.out.println(acc02);

        acc01.transfer(acc02,200.00);

        System.out.println(acc01);
        System.out.println(acc02);
    }
}
