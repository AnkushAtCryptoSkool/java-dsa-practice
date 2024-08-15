package Threads;

public class Counter {
    private  int count = 0;

    public int  increement() {
        synchronized (this){
            this.count++;
        }
        return this.count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
