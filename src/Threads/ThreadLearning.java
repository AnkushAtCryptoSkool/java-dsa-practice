package Threads;

import Threads.Thread1;

public class ThreadLearning {
    public static void main(String[] args) throws InterruptedException {
//        Thread1 t = new Thread1();
//        Thread thread = new Thread(t);
//        thread.start();
//        System.out.println(Thread.activeCount());

        // sleep method
        // join- wait untill that thread to complete on which it is called
        // Syncronization
//        Counter counter = new Counter();
//        MyThread t1 = new MyThread(counter);
//        t1.setName("Thread 1");
//        MyThread t2 = new MyThread(counter);
//        t2.setName("Thread 2");
//        t1.start();
//        t2.start();
//        try{
//            t1.join();
//            t2.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println(counter.getCount());
        // Disadvantages of syncronized - Fairness nahi (koi bhi kabhi chal raha hai)
        // Blocking nahi hai - explicitly |  No Interputiblity -| No read write locking fxn avaliable
        // Hence we use explict loct using Reentrant Lock();
       BankAccount bankAccount = new BankAccount();
       Runnable task = new Runnable() {
           @Override
           public void run() {
               bankAccount.withdraw(50);
           }
       };
        Thread t1 = new Thread(task,"T1");
        Thread t2 = new Thread(task,"T2");
        t1.start(); t2.start();
        System.out.println(0.2+0.3 == 0.5);
    }
}
