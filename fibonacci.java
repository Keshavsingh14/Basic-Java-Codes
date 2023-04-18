package Recursion;

public class fibonacci {
    static int fib(int n){
        if(n<=1){
            return 0;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void amin(String args[]){
        int n = 7;
        fib(n);
    }
}
