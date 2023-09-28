import java.util.Arrays;

import javax.xml.transform.Source;
public class ReversrString {

    static void sortString(String s1){
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }
    }

    static void checkVowel(String s1){
        for(int i=0; i<s1.length()-1; i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' ){
                // System.out.println(s1.charAt(i));
                
            }else{
                System.out.print(s1.charAt(i)+" ");
            }
        }
    }

    public static void main(String[] args) {
    //     String s1 = "Think Twice";
    //     s1 = s1.toLowerCase();
    //     String s2 = "";

    //     String[] arr = s1.split(" ");

    //     for(String elem:arr){
        
    //     for(int i=elem.length()-1; i>=0; i--){
    //     s2 += elem.charAt(i);
    //     }
    //     s2 = s2 + " ";
    // }
    // System.out.println(s2);
    // String s = "furkan danish";
    // sortString(s);
    // checkVowel(s);
    



                 String str1 = "one";

                 String str2 = "two";

                 System.out.println(str1.concat(str2));

    
    
    }
    
}
