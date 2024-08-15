package DSA150Questions;

public class NextGreaterElement_III {
    public static void main(String[] args) {
        int n = 2147483486;
        int ans  = nextGreaterElement_III_finder(n);
        System.out.println(ans);
    }

    private static int nextGreaterElement_III_finder(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int i = arr.length-2;
        String val = "";
        while(i>=0 && arr[i] >= arr[i+1])
            i--;
        if(i<0)
            return -1;

            int k = arr.length-1;
            while(arr[k] <= arr[i])
                k--;
            char a = arr[i];
            arr[i] = arr[k];
            arr[k] = a;
            for(int x=0;x<=i;x++)
                val += arr[x];
            for(int x=arr.length-1;x>i;x--)
                val += arr[x];
         long ans = Long.parseLong(val);
            if(ans >= Integer.MAX_VALUE)
                return -1;
            return (int)ans;

    }
}
