public class reverse {
    public static void main(String args[]){
        int n = 32145;
        System.out.println(inverseNumber(n));
    }
    private static int inverseNumber(int n){
        int ans= 0;
        int place = 1;
        while(n != 0){
            int rem = n % 10;
            ans = ans + place *(int)(Math.pow(10, rem-1));
            n = n/10;
            place++;
        }
        return ans;
    }
}
