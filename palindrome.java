package Recursion;

public class palindrome {
    boolean isPalindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        return(str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }
}
