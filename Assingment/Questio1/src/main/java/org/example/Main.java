package org.example;
class Account{
    int id;
    String name;
    double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double ammount){
        balance += ammount;
        System.out.println("Deposit: " + ammount);
    }

    public void withdrawl(double ammount){
        if (balance >= ammount) {
            balance -= ammount;
            System.out.println("Withdrawal: " + ammount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }



    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        //creating account
        Account account = new Account(1,"arif", 10000);

        //deposite money
        account.deposit(1000);
        System.out.println(account);

        //withdraw money
        account.withdrawl(3000);
        System.out.println(account);
    }
}