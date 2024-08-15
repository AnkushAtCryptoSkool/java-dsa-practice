package DSA150Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        System.out.println(isDuplicate(list, 8));;
    }

    private static boolean isDuplicate(List<Integer> list, int i) {
//        return false;
        boolean contains = list.contains(i);
        return contains;
    }

}