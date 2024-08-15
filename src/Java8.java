import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,232,43,23,12,23,42,43,12,32);
        System.out.println(list);
        System.out.println("first occuerence");
        list.stream().findFirst().ifPresent(System.out::println);
        System.out.println("total no of elements");
        System.out.println(list.size());
        System.out.println(list.stream().count());
        System.out.println("even number exits in a list");
        list.stream().filter(num -> num%2 == 0).forEach(val -> System.out.print(val+" "));
        System.out.println();
        System.out.println("odd number exits in a list");
        list.stream().filter(num -> num%2 != 0).forEach(val -> System.out.print(val+" "));
        System.out.println("Number Starting with 3");
//        List<String> list2 = Arrays.asList("12","23","34","46");
        list.stream().map(val->val.toString()).filter(v->v.startsWith("3")).forEach(val -> System.out.print( val+" "));
        System.out.println();
        System.out.println("Find Duplicates");
        Set<Integer> set = new HashSet<>();
         List<Integer> ans =  list.stream().filter(val -> !set.add(val)).collect(Collectors.toList());
        System.out.println(ans);
        System.out.println("Find Max or Min val from the list");
        System.out.println("Min val : "+list.stream().min(Integer::compareTo).get());
        System.out.println("Max val : "+list.stream().max(Integer::compareTo).get());
        System.out.println("sort arrayList desc ---");
        list.stream().sorted((a,b) -> b-a).forEach((val)-> System.out.print(val + " "));
        System.out.println();
        System.out.println("sort arrayList asc ---");
        list.stream().sorted((a,b) -> a-b).forEach((val)-> System.out.print(val + " "));
       // check array contains dupli cates
        int arr[] = {1,3,45,3,23,22,34};
        System.out.println();
        if(Arrays.stream(arr).distinct().count()== arr.length)
            System.out.println("Array vals are unique");
        else
            System.out.println("Array contains duplicate");

        System.out.println("Square the val of array and return val greater than 100");
        Arrays.stream(arr).map(x->x*x).filter(val -> val>100).forEach(v-> System.out.print(v+" "));
        System.out.println("Sort the array and print the sorted array");
        System.out.println("UnSorted Array : "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
        System.out.println("COnvert all elements to Upper Case");
        List<String> l2 = Arrays.asList("car","orange","ram","kam","Karasg");
        l2.stream().map(val -> val.toUpperCase()).forEach(val -> System.out.print(val + " "));
        System.out.println();
        System.out.println("Max in the array");
        Arrays.stream(arr).max().ifPresent(System.out::println);
        System.out.println("Conact 2 Streams ");
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream2 = Stream.of(5,6,7,8);
        Stream.concat(stream1,stream2).forEach(val-> System.out.print(val+" "));
        System.out.println();
        System.out.println("Print 10 random number using java 8");
        Random random = new Random();
        Stream.generate(random::nextInt).map(s->s.toString()).map(s->s.substring(0,3)).limit(10).forEach(System.out::println);
        System.out.println("Print Local Date and Time");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("Print date in the format : dd-MM-yyyy format ?");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDateTime));
        System.out.println("Check List is Empty or Not");
        List<String> list1 = Arrays.asList("abc","dcd","ram","priya","priya","priya","ram","ram","abc");
        Optional<List<String>> optionalList = Optional.ofNullable(list1);
        optionalList.ifPresentOrElse((val)-> val.forEach(s -> System.out.print(s+" ")),()-> System.out.println("List is empty"));
        System.out.println();
        System.out.println("Frequency of number in an array");
        System.out.println(Arrays.stream(arr).filter(val -> val==3).count());
        System.out.println("FInd Duplicates with its count");
        Map<String,Long> map = list1.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        map.entrySet().stream().filter(s-> s.getValue()>1).forEach(s -> System.out.println(s.getKey() + " : "+ s.getValue()));

        Emp emp1 = new Emp(10000,"Ankush");
        Emp emp2 = new Emp(1000,"Ram");
        Emp emp3 = new Emp(2000,"Shyam");
        Emp emp4 = new Emp(3000,"Cool");
        List<Emp> empList = Arrays.asList(emp1,emp2,emp3,emp4);
        System.out.println(empList.stream().mapToInt(Emp::getSalary).sum());
        System.out.println("Convert String into char values ");
        String s = "AnkushChauhanV1";
        Map<Character,Long> frequecnyCharMap = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequecnyCharMap);
    }
}
