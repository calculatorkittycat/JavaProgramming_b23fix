package day_38_CustomClasses.bankAccountTask;

public class BankAccount {

public String accountHolder;
public long accountNumber;
public double balance;

public void setInfo(String accountHolder, long accountNumber){
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
}

public void deposit(double amount){
    if(amount <= 0){
        System.out.println("You can not deposit 0 or a negative amount");
        return;
    }

    System.out.println("Depositing " + amount +" to account " +accountNumber);
    balance += amount;
}

public void withdraw(double amount){
    if(amount <= 0){
        System.out.println("You can not withdraw a negative amount or 0");
        return;
    }

    if (balance <= 0){
        System.out.println("Insufficient funds");
        return;
    }
    if(amount > balance){
        balance -= 35;
    }

    System.out.println("Withdrawing " + amount + " from account " + accountNumber);
    balance -= amount;
}

public void checkBalance(){
    System.out.println(accountHolder + " Your balance is $" + balance);
}




}
