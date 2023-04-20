
import java.util.*;


public class first {
    public static void main(String args[]){
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("keshav", 21);
        m.put("puneet", 20);
        m.put("babes", 27);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
