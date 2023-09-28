import java.util.*;
public class StringQ1 {

    

    String reverseChar1(String s1){
        String s2 = "";
        for(int i=s1.length()-1; i>=0; i--){
            s2 += s1.charAt(i);
        }
        return s2;
    }

    void polindrome(String s1){
        // String s2 = "";
        // for(int i=s1.length()-1; i>=0; i--){
        //     s2 += s1.charAt(i);
        // }
        if(s1.equals(reverseChar1(s1)) ){
            System.out.println("polindrome");
        }else{
            System.out.println("not polindrome");
        }
    }

    void reverseString1(String s1){
        String rev[] = s1.split(" ");

        String s2 = "";
        for(String ele : rev){
            for(int i = ele.length()-1; i>=0; i--){
                s2 += s1.charAt(i);
            }
            s2 += " ";
            
        }

        
        System.out.println(s2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter string: ");
        // String s1 = sc.nextLine();
        String s1 = "2552";
        String s2 = "";
        for(int i=s1.length()-1; i>=0; i--){
            s2 += s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("String is polindrome");
        }else{
            System.out.println("String is not polindrome");
        }


    }
}
