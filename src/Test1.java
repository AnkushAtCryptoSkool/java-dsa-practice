import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
//        List<Employeee> empList = Arrays.asList(new Employeee(1,"Ankush"),new Employeee(2,"Ram"),new Employeee(3,"AB"));
//        List<Integer> ids = empList.stream().filter(emp -> emp.getName() == "Ankush").map(emp -> emp.getId()).collect(Collectors.toList());
//        System.out.println(ids);
        Test1 t = new Test1();
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int ans = t.removeElement(arr,2);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
    public int removeElement(int[] arr, int val) {
        int i = 0, j = arr.length-1;
        int count=0;
        while(i < j){     //        3 3 2 2
            if(arr[i] == val){//       ji
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else{
                i++;
            }
        }
        for(int k=arr.length-1;k>=0;k--){
            if(arr[k] == val){
                count++;
            }
        }

        return arr.length-count;
    }
}
