
import java.util.*;

class MaxOccuranceChar{
    
    char maxOccChar(String s1){
        int[] arr= new int[127];
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i)] = arr[s1.charAt(i)] + 1;
        }
        int max = -1;
        char c = ' ';
        for(int i=0; i<s1.length(); i++){
            if(max < arr[s1.charAt(i)]){
                max = arr[s1.charAt(i)];
                c = s1.charAt(i);
            }
        }
        return c;
        
}

class Polindrome {

     }

     void reverseString(String s1){
        int n= s1.length();
        String rev = "";
        for(int i=n-1; i>=0; i--){
         rev += s1.charAt(i);
        }
        System.out.println(rev);
    }

    void checkPolindrome(String s1){
        int n= s1.length();
        String rev = "";
        for(int i=n-1; i>=0; i--){
         rev += s1.charAt(i);
        }
        if(s1.equals(rev)){
            System.out.println("Polindrome");
        }else{
            System.out.println("Not Polindrome");
        }

    }

}

public class StringQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = sc.next();

        Polindrome obj1 = new Polindrome();
        
    //    obj1.reverseString(s1);
    //    obj1.checkPolindrome(s1);
        MaxOccuranceChar obj2 = new MaxOccuranceChar();

        System.out.println(obj2.maxOccChar(s1));
       
      
    }
}