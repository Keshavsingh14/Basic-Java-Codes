import java.util.*;

public class count_distinct_elements {
     static int countDistinct(int[] arr){
        int res = 0;
        for(int i =0; i<arr.length-1; i++){
            boolean flag = false;
            for(int j = 0; j<i; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                res++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr = {10,20,10,20,30,40};
        System.out.println(countDistinct(arr));  
    }

// now using HashMap...

static int count(int[] arr){
    HashSet<Integer> s = new HashSet<>();
    for(int i =0; i<arr.length; i++){
        s.add(arr[i]);
        return s.size();
    }
    return 0;
}
}
