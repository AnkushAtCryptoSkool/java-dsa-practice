package DSA150Questions;

public class Find_the_Index_of_the_First_Occurrence {
    public static void main(String[] args) {
        String str1 = "hewewewewwwwwwddewewwello";
        String str2 = "ll";
        System.out.println(Find_the_Index_of_the_First_Occurrence_Ans(str1,str2));
    }

    private static int Find_the_Index_of_the_First_Occurrence_Ans(String str1,String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if(n2>n1)
            return -1;
        int i=0;
        int start = 0;
        int j=0;
        while(i<n1 && j<n2){
            if(str1.charAt(i) == str2.charAt(j)){
                if(i-start+1 == n2)
                    return start;
                i++;
                j++;
            }else{
                j=0;
                start++;
                i = start;
            }
        }
        return -1;
    }
}
