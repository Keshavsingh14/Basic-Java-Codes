import java.util.*;
public class arrayExcept{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(product(arr));
    }
    public static int[] product(int arr[]){
        int temp = 1;
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i] = temp;
            temp *= arr[i];
        }
        temp = 1;
        for(int i = arr.length-1; i>=0; i--){
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }
        return result;
    }
}
