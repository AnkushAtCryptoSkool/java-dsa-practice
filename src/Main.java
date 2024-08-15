import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//         Manager manager = new Manager();
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(new Manager().defination);
//        }
//        Scanner scn = new Scanner(System.in);
//        int x; // initialize x to avoid compilation error
//        // if (scn.hasNextInt()) { // check if there is an integer input
//        x = scn.nextInt(); // read the input
//        // }
//        System.out.println(x);
//        int x = (int)100000L;
//        System.out.println(x);
//        double f = 2.3;
//        long l = 1000;
//        Double D = 102.2;
//        System.out.println(Double.BYTES);
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int p = Integer.parseInt(null);
//        System.out.println(p);
//        pattern1(n);
      //  printDiamond(n);
//        hollowDiamond(n);
//    find factorial
//        int r = scn.nextInt();
//        int ans = factorial(n) / (factorial(r) * factorial(n-r));
////        int ans = factorial(n);
//        System.out.println(ans);

//        countingFactorsOptimizedApproch(n);
    // finding prime number
//        primeFactorCalculationOptimizedApproch(n);
    // finding square root
//        floorOfSqrtOfNumber(n);
//        sumAndProductOfDigitsOfAnumber(n);
//        findMaxOfArray(n, scn);
//        swap2variables();
        int arr[] = {3,-2,1,4,6,9,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int n = arr.length;
        System.out.println(n);
        int k = 3;
        k = k%n;
        if(k <0)
            k = n+k;
      int sp = n-k;
        System.out.println(sp);
      int ep = n-1;
        System.out.println(ep);
        arraySwappingFxn(sp, ep, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       sp = 0;
       ep = n-k-1;
        arraySwappingFxn(sp,ep,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sp = 0;
        ep = n-1;
        arraySwappingFxn(sp,ep,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void arraySwappingFxn(int sp, int ep, int[] arr) {
        while (sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
//            System.out.println(arr[sp] + " , " + arr[ep]);
            sp++;
            ep--;
        }
    }

    private static void swap2variables() {
        int a = 10;
        int b = 20;
        System.out.println("a, b -> " + a + ", " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a, b -> " + a + ", " +b);
    }

    private static void findMaxOfArray(int n, Scanner scn) {
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
         arr[i] = scn.nextInt();
        }
        int sum = 0;
        for(int i = 0; i< n; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        int max= Integer.MIN_VALUE;
        for (int i = 0; i< n; i++){
            if(arr[i] >= max)
                max = arr[i];
        }
        System.out.println(max);
    }

    private static void sumAndProductOfDigitsOfAnumber(int n) {
        int i =1;
        int temp = n;
        int prod = 1;
        int sum = 0;
        while(n >0){
            int rem = n %10;
            sum = sum + rem;
            prod = prod*rem;
        n = n /10;
        }
        System.out.println(sum);
        System.out.println(prod);
        System.out.println(prod-sum);
    }

    private static void floorOfSqrtOfNumber(int n) {
        int ans = 0;
        for(int i = 1; i<= n; i++){
            if(i*i >= n){    //   60
                if(i*i == n){
                    ans = i;
                }else{
                    ans = i-1;
                }
                break;
            }
        }
        System.out.println(ans);
    }

    private static void primeFactorCalculationOptimizedApproch(int n) {
        int ans = countingFactorsOptimizedApproch(n);
        if(ans == 2){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }

    private static int countingFactorsOptimizedApproch(int n) {
        int count = 0;
        for(int i = 1; i*i<= n; i++){
         if(n %i==0){
             if(i != (n /i))
                 count += 2;
             else
                 count++;
         }
        }
//        System.out.println(" No of factors : " + count);
        return count;
    }

    private static int factorial(int n){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans*i;
        }
        return ans;
    }

    private static void hollowDiamond(int n) {
        int star = n /2+1;
        int space = 1;
        for(int i = 1; i<= n; i++){
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for (int k = 1; k <=space ; k++) {
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i <= n /2){
                star--;
                space += 2;

            }else{
                star++;
                space -= 2;
            }
        }
    }

    private static void printDiamond(int n) {
        int space = n /2;
        int star = 1;
        int no_of_starts = 1;
        for(int i = 1; i<= n; i++){
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= star ; k++) {
                System.out.print("* ");
            }
            System.out.println();
            if(i<= n /2){
                star += 2;
                space--;
            }
            else{
                star -= 2;
                space++;
            }
        }
    }

    private static void number_pattern1(int n) {
        int printVal = 1;
        int nos = 1;
        for (int i = 1; i<= n; i++){
            for (int j = 1; j <=nos ; j++) {
                System.out.print(printVal + " ");
                printVal++;
            }
            nos++;
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for(int i = 1; i<= n; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}