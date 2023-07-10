import java.util.*;
public class Reverseee {
    public static void main(String args[]){
        int arr[] = {0,2,4,1,3};
        int ans[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            ans[arr[i]] = i;
        }
        System.out.println(Arrays.toString(ans));
    }
}
