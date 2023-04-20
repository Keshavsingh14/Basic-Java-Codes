
import java.util.*;
public class recursion {
    public static void main(String args[]){
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            displayArray(arr, 0);
        }

    }

    public static int displayArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        displayArray(arr, idx+1);
        System.out.println(arr[idx]);
        return idx;
    }
}
