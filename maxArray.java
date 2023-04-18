package Recursion;
import java.util.*;

public class maxArray {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for(int i =0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int max = maxOfArray(arr, 0);
            System.out.println(max);
        }
    }
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int misa = maxOfArray(arr, idx+1);
        if(misa > arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
    }
}
