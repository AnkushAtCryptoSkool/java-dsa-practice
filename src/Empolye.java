import java.util.Scanner;

public interface Empolye {
    void getSalary();

    public static void main(String[] args) {
        Employeee employeee = new Employeee(1,"Ankush");
        System.out.println(employeee);
        System.err.println(employeee);
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        int x = sc.nextInt();
        System.err.println(x);
    }
}
