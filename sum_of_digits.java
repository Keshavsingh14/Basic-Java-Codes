package Recursion;

public class sum_of_digits {
     static int sum(int n){
        if(n == 0){
            return 0;
        }
        return sum(n/10) + n%10;
     }
     public static void main(String args[]){
        int n = 4567;
        sum(n);
     }
}
