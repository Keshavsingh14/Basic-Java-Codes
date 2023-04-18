package Recursion;
import java.util.*;
public class reverseArray {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            displayArray(arr, 0);
        }
    }
    static void displayArray(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        displayArray(arr, index+1);
        System.out.println(arr[index]);
    }
}
