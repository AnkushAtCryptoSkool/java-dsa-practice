import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTestAnkush {
    public static void main(String[] args) {
        /*
  Question - Find number of substring in which number of ones in the string is greater than or equal to the square of the number of zeros in the string.
Example : Input: s = "00011" -   no of zeroes (3) >= 9
*    0 , 00 , 000, 0001, 00011  - no of ones > = (no of zeros)^2
*   0,00, 001, 0011
* 0 , 01 , 011 -  ( 01 , 011, 1, 11, 1)
* 1 , 11
* 1 , ""
Output: 5
Input: s = "101101"
Output: 16
Input: "10011"
output: 7
Input = "111111"
21
        * */
        // emp - name, id, salaray,
        // all emp salaray greater than 50k
        // convert it into map (id String , empyolee)
        Employeee1 emp1 = new Employeee1("1","Ankush","FC",50000);
        Employeee1 emp2 = new Employeee1("2","Ram","FC",10000);
        Employeee1 emp3 = new Employeee1("3","Shyam","FC",60000);
        Employeee1 emp4 = new Employeee1("4","Kam","FC",70000);
        ArrayList<Employeee1> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        Map<String, Employeee1> collect = list.stream().filter((e) -> e.getSalary() > 50000).collect(Collectors.toMap(Employeee1::getId, e -> e));
        System.out.println(collect);

    }
}
