package Threads;

public class Thread1 implements Runnable{
    @Override
    public void run() {
//        for (int i = 0; i < 5000; i++) {
//            System.out.println("Thread is running - Runnable wala !!!");
//        }
        System.out.println(Thread.currentThread().getName());

    }
}
