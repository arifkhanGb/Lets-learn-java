package Day_13_14;

import java.util.Scanner;

class Account{

    private int bal;
    Account(int bal )
    {
        this.bal = bal;

    }
    public boolean isSufficientBalance(int w){
        if(bal>w)
            return true;
        else
            return false;
    }
    public void withdrawl(int amt)
    {
        bal -=amt;
        System.out.println("withdrawl money is = "+amt);
        System.out.println("your current balance is = "+bal);
    }
}
class Costumer implements Runnable
{
    private String name;
    Account account;
    Costumer(Account account , String n){
        this.account = account;
        name = n;
    }
    public void run(){
        Scanner kb = new Scanner(System.in);
        System.out.println(name  + "enter amount to withdrow");
        int amt = kb.nextInt();

        // At a time only a single thread can use this block of code [using Syncronizec]
        synchronized (account) {
            if (account.isSufficientBalance(amt)) {
                System.out.println(name);
                account.withdrawl(amt);
            } else
                System.out.println("insufficient balance");
        }
    }
}

public class ExampleThread {
    public static void main(String[] args) {
        Account a1=new Account(1000);
        Costumer c1 = new Costumer(a1 , "jack") , c2 = new Costumer(a1 , "sparrow");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
