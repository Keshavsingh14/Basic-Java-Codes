import java.util.*;
class reverseString{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t > 0){
            String str = s.nextLine();
            System.out.println(reverse(str));
        }
    }
    static String reverse(String str){
        int n = str.length();
        if(n == 0) return "";
        int l = 0, r = n-1;
        while(l<r){
            char[] ch = str.toCharArray();
            char c = ch[l];
            ch[l] = ch[r];
            ch[r] = c;
            l++;
            r--;
        }
        return new String();

    }
}