package dsaImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Stackk {
  Queue<Integer> queue;
     Stackk(){
       queue = new LinkedList<>();
     }
     public int push(int val){
        queue.offer(val);
       return val;
     }
     public int peek(){
       int size = queue.size();
       while (size > 1){
            queue.offer(queue.poll());
            size--;
       }
       return queue.peek();
     }
     public int pop(){
       peek();
       return queue.remove();
     }

  public static void main(String[] args) {
    Stackk stackk = new Stackk();
    stackk.push(1);
    stackk.push(2);
    stackk.push(3);
    stackk.push(4);
    stackk.push(5);
    System.out.println(stackk.peek());
    System.out.println(stackk.pop());
    System.out.println(stackk.peek());

  }
}
