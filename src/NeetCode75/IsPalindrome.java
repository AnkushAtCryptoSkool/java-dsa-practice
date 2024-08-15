package NeetCode75;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s.trim();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)  >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i)  >= '0' && s.charAt(i) <= '9') ||
                    (s.charAt(i)  >= 'A' && s.charAt(i) <= 'Z')){
                System.out.println(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        String temp = sb.toString().toLowerCase();
        System.out.println(temp);
        int start = 0;
        int end = temp.length()-1;
        while(start <=end){
            if(temp.charAt(start) != temp.charAt(end))
                return false;
            start++;
            end--;
        }
          return true;
    }
}
