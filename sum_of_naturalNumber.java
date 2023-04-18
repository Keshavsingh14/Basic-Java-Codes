package Recursion;

public class sum_of_naturalNumber {
      static int getSum(int n){
        if(n == 0){
            return 0;
        }
        return n + getSum(n-1);
      }

      public static void main(String args[]){
        int n = 5;
        System.out.println(getSum(n));
      }
}
