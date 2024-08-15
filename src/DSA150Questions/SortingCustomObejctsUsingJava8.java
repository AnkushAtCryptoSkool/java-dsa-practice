package DSA150Questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingCustomObejctsUsingJava8 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        Collections.sort(people,(p1,p2)->Integer.compare(p2.age,p1.age));
        System.out.println(people);
        Collections.sort(people,(p1,p2)-> p1.name.compareTo(p1.name));
        System.out.println(people);
        Person x1 = new Person("A", 1);
        Person x2 = x1;
        System.out.println(new Person("A",1).hashCode());
        System.out.println(new Person("A",1).hashCode());
        System.out.println(new Person("A",1).hashCode());
        System.out.println(new Person("A",1).getClass());
        System.out.println(x1.equals(x2));
        System.out.println(x1.hashCode());
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println();
    }
}
