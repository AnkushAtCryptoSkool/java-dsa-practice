package dsaImpl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Keue {

   private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;
    Keue(){
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    public boolean offer(Integer val){
        if(val == null)
            return false;

        inputStack.push(val);
        return true;
    }
    public int peek(){
         if(outputStack.isEmpty()){
             while (!inputStack.isEmpty()){
                 outputStack.push(inputStack.pop());
             }
         }
         return outputStack.peek();
    }
    public int pop(){
       peek();
       return outputStack.pop();
    }
    public void print(){
        Stack<Integer> temp  = new Stack<>();
        while (!inputStack.isEmpty()){
            temp.push(inputStack.pop());
        }
        while (!temp.isEmpty()){
//            System.out.print(temp.peek() + " -> ");
            outputStack.push(temp.pop());
        }
        while (!outputStack.isEmpty()){
            System.out.print(outputStack.peek() + " -> ");
            inputStack.push(outputStack.pop());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
       Keue keue = new Keue();
        keue.offer(1);
        keue.offer(2);
        keue.offer(3);
        keue.offer(4);
//        keue.print();
        keue.pop();
        System.out.println(keue.peek());
//        System.out.println();
//        keue.print();
    }
}
