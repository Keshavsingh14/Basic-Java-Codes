
//print subarrays ...
//import java.util.*;
public class SubArray {
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            for(int j =i; j< arr.length; j++){
                int sum = 0;
               // for(int k =i; k<=j; k++){
                    sum+= arr[j];
                    System.out.print(arr[j]+" ");
               // }
                ans = Math.max(ans, sum);
                System.out.println("=>"+sum);
            }
        }
        System.out.println(ans);
    }
}
