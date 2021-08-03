package day_38_CustomClasses.bankAccountTask;

import day_38_CustomClasses.bankAccountTask.BankAccount;

public class CapitolOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Christian",845658153);

        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(999);
        account1.checkBalance();
        account1.withdraw(25);
        account1.checkBalance();
        account1.withdraw(10);

        System.out.println("__________________");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ahmad", 1597532154);

        account2.deposit(100000);

        account2.checkBalance();

    }
}
