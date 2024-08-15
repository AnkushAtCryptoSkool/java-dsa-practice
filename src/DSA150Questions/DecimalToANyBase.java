package DSA150Questions;

import java.util.Scanner;

public class DecimalToANyBase {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number");
        Integer number = myObj.nextInt();
        System.out.println("Enter Base");
        Integer base = myObj.nextInt();
//        int ans1 = DecimalTOANyBase(number,base);
//        System.out.println(ans1);
        int ans2 = anyBaseToDecimal(number,base);
        System.out.println(ans2);
    }

    private static int DecimalTOANyBase(Integer number, Integer base) {
        int result = 0;
        int pow = 1;
        while(number>0){
            int digit = number%base;
            result += digit*pow;
            number = number/base;
            pow = pow*10;
        }
        return result;
    }
    private static int anyBaseToDecimal(Integer number,Integer currentBase){
        int result = 0;
        int pow = 1;
        while(number>0){
            int digit  = number%10;
            number = number/10;
            result += digit*pow;
            pow = pow * currentBase;
        }
        return result;
    }
}
