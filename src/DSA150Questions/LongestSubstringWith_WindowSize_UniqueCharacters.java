package DSA150Questions;

import java.util.HashMap;

//Longest Substring With Without Repeating Characters | Variable Size Sliding Window
public class LongestSubstringWith_WindowSize_UniqueCharacters {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,1,-4,-2,2,1,1,1};
        char a[] = "abcabcbb".toCharArray();
        int ans = LongestSubstringWith_WindowSize_UniqueCharacters_finder(a);
        System.out.println(ans);
    }

    private static int LongestSubstringWith_WindowSize_UniqueCharacters_finder(char[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, n = arr.length, max = Integer.MIN_VALUE;
        while (j < n) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            if (map.size() > j - i + 1) {
                j++;
            } else if (map.size() ==j - i + 1) {
                max = Math.max(max, j - i + 1);
                j++;
            } else if (map.size() < j-i+1) { // k = j-i+1 (window size) {
                while (map.size() < j-i+1) {
                    map.put(arr[i], map.get(arr[i]) - 1);
                    if (map.get(arr[i]) == 0) {
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

