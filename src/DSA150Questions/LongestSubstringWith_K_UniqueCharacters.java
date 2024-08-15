package DSA150Questions;

import java.util.HashMap;

public class LongestSubstringWith_K_UniqueCharacters {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,-4,-2,2,1,1,1};
        char a[] = "aabbcc".toCharArray();
        int ans = LongestSubstringWith_K_UniqueCharacters_finder(a,0);
        System.out.println(ans);
    }

    private static int LongestSubstringWith_K_UniqueCharacters_finder(char[] arr, int k) {
        if(k<=0)
            return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0,n=arr.length,max = Integer.MIN_VALUE;
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(map.size() < k){
                j++;
            } else if (map.size()==k) {
                max = Math.max(max,j-i+1);
                j++;
            } else if (map.size()>k) {
                while(map.size()>k){
                    map.put(arr[i],map.get(arr[i])-1);
                    if(map.get(arr[i]) == 0){
                        map.remove(arr[i]);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
