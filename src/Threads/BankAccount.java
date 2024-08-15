package Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    /* public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw : "+amount);
        if(balance >= amount){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
        balance = balance-amount;
        System.out.println(Thread.currentThread().getName() + " withdraw successful, remaining balance : "+balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " withdraw rollbacked , insufficient balance : (");
        }
    } */
     public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw : "+amount);
       try{
           if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
               System.out.println(Thread.currentThread().getName() + " acquired the lock");
               if(balance >= amount){
                   try {
                       Thread.sleep(5000);
                       balance = balance-amount;
                       System.out.println(Thread.currentThread().getName() + " withdraw successful, remaining balance : "+balance);
                   } catch (InterruptedException e) {

                   }
                  finally {
                       System.out.println("Lock is unlocked by : "+Thread.currentThread().getName());
                       lock.unlock();
                   }
               }else {
                   System.out.println(Thread.currentThread().getName() + " withdraw rollbacked , insufficient balance : (");
               }
           }else{
               System.out.println(Thread.currentThread().getName() + " could not able to acquire lock");
           }
       }catch (Exception ex){
           System.out.println(ex);
       }
    }
}
