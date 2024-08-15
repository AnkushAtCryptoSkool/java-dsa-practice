package DSA150Questions.binarySearch;

public class Binary_Seach_Matrix_Median {
    public static void main(String[] args) {
        int n2[][] = {{1, 3, 5},
                      {2, 6, 9},
                     {3, 6, 9}};
        int n1[][] = {{2},{4},{5}};
        int ans = matrixMedian(n1);
        System.out.println(ans);
    }

    private static int matrixMedian(int[][] arr) {
        int c = arr[0].length;
        int r = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min = Math.min(arr[i][0],min); // 2
            max = Math.max(arr[i][c-1],max); // 5
        }
        int dc = ((c*r)+1)/2; // desired count = 2
         while(min<max){ // min = 2 , max = 5
             int mid = min+(max-min)/2; // 4
             int cc = 0; // current count = 0
              for(int i=0;i<r;i++){
                  int s = 0, e = c-1; // s = 0 , e= 0
                  while(s<e){ // 2  || 4 || 5
                      int md = s + (e-s)/2; // 0
                      if(arr[i][md] <=mid){
                          s = md+1;
                      }else{
                          e = md;
                      }
                  }
                  if(arr[i][s] <= mid) // 2 <= 4
                      cc++;

                  cc += s; // 2
              }
              if(cc < dc){ // cc = 1  dc = 2
                 min = mid+1; // min =  4
             }else{
                 max = mid; // max = 4;
             }
         }
        return min;
    }
}
