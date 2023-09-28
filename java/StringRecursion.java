import java.util.*;

class Palindrome{
    boolean isPalindrome(String s, int l, int r){
        if(l >= r)
        return true;

        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1));
    }
}

public class StringRecursion {

    static String reverse(String s, int idx) {
        if (idx == s.length())
            return "";

        String smallAns = reverse(s, idx + 1);

        return smallAns + s.charAt(idx);
    }

    static String removeA(String s, int idx) {
        if (idx == s.length()) {
            return " ";
        }
        String smallAns = removeA(s, idx + 1);

        char currChar = s.charAt(idx);

        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        int n = s.length();

        // System.out.println(removeA(s, 0));
        // System.out.println(reverse(s, 0));
        Palindrome obj1 = new Palindrome();
        System.out.println(obj1.isPalindrome(s, 0, n-1));

    }
}