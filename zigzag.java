
import java.util.*;

public class zigzag {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            puzz(n);
        }
    }

    public static void puzz(int n){
        if(n == 0){
            return;
        }
        System.out.print(n);
        puzz(n-1);
        System.out.println(n);
        puzz(n-1);
        System.out.println(n);

    }
}
