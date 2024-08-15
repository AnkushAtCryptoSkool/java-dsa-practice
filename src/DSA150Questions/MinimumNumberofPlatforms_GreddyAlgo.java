package DSA150Questions;

import java.util.Arrays;

public class MinimumNumberofPlatforms_GreddyAlgo {
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 100, 300, 500,700,600 };
        int dep[] = { 900, 400, 600,900,700 };
        int n = 5;
        System.out.println(findPlatform(arr, dep, n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        Arrays.sort(arr); // min arrival starting point
        Arrays.sort(dep); // for every arrival ,a departure is also happening
        int maxTrains_AtSingle_Point_Of_Time = 0;
        int platform_requiered = 0;
        int i=0,j=0;
        while(i<n &&j <n){
            if(arr[i] <= dep[j]){
                maxTrains_AtSingle_Point_Of_Time++;
                i++;
            }else{
                maxTrains_AtSingle_Point_Of_Time--;
                j++;
            }
            platform_requiered = Math.max(platform_requiered,maxTrains_AtSingle_Point_Of_Time);
        }
        return platform_requiered;
    }
}
