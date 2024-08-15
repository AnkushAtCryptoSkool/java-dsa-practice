package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();
    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("Outer Method called by" + " " + Thread.currentThread().getName());
            innerMethod();
        }catch (Exception e){

        }finally {
            System.out.println("Unlocking done on outer Method"+ " " + Thread.currentThread().getName());
            lock.unlock();
        }
    }
    public void innerMethod(){
        lock.lock();
        try {
            System.out.println("Inner Method called by"+ " " + Thread.currentThread().getName());
        }catch (Exception e){

        }finally {
            System.out.println("Unlocking done on inner Method"+ " " + Thread.currentThread().getName());
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
