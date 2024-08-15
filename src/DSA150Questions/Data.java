package DSA150Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Data {
    int salary;
    int age;
    String name;
    String company;

    public  Data(){
    }

    public  Data(int salary,int age,String name,String company){
        this.salary = salary;
        this.company = company;
        this.age = age;
        this.name = name;

    }

    public int getSalary(){
        return this.salary;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getCompany(){
        return this.company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        String ans = this.name + " , " + this.age + " , " + this.salary + " , " + this.company;
        return ans;
    }

    public static void main(String[] args) {
        Data d1 = new Data(1000,10,"Ankush","Freecharge");
        Data d2 = new Data(1000,40,"Ankush","Freecharge");
        Data d3 = new Data(1000,30,"Ankush","Freecharge");
        Data d4 = new Data(1000,40,"Ankush","Freecharge");
        ArrayList<Data> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        list.add(d1);

        Map<Integer, List<Data>> dataMap = list.stream().collect(Collectors.groupingBy(Data::getAge));

        System.out.println(dataMap);

    }

}
