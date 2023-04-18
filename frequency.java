package hashMap;
import java.util.*;
public class frequency {
    static int freq(int[] arr){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int x : arr){
            hash.put(x, hash.getOrDefault(x, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : hash.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        return hash.size();
    }
    public static void main(String args[]){
        int arr[] = {50,50,10,40,10};
        freq(arr);
    }
     
}
