package DSA150Questions;

import java.util.*;

class Pair{
    int idx;
    int val;
    Pair(int idx,int val){
        this.idx = idx;
        this.val = val;
    }

    @Override
    public String toString() {
        return idx + " (" + val + ")";
    }

}

class Person implements Cloneable{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static int[] twoSum(int[] nums, int target) {
        Pair[] pairs = new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            pairs[i] = new Pair(i,nums[i]);
        }
        Arrays.sort(pairs,Comparator.comparingInt(pair -> pair.val));
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i].idx + " , " + pairs[i].val);
        }
        Arrays.asList();
        int si = 0;
        int arr[] = new int[2];
        int ei = nums.length-1;
        while(si <= ei){
            int s_val = pairs[si].val;
            int e_val = pairs[ei].val;
            if(s_val + e_val < target){
                si++;
            }else if (s_val + e_val > target){
                ei--;
            }else{
                arr[0] = pairs[si].idx;
                arr[1] = pairs[ei].idx;
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        Arrays.sort(people, Comparator.comparingInt(person -> person.age));
        System.out.println(Arrays.toString(people));  // Output: [Bob (25), Alice (30), Charlie (35)]
        twoSum(new int[]{2, 7, 11, 15},9);
    }
}

