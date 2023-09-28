import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "School Master";
        String s2 = "The Class room java";

        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    if(Arrays.equals(ch1, ch2)){
        System.out.println("it's anagram");
    }else{
        System.out.println("it's not anagram");
    }
    String s1 = "pwskill";
    char ch[] = s1.toCharArray();
    int n = ch.length;
    

    removeDuplicate(ch,n);
}

//Creating RemoveDuplicatesExample1 class     
  
    //Creating removeDuplicates() method to remove duplicates from array  
    static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
        // Traversing character array  
        for (int i = 0; i < length; i++)   
        {   

            // Check whether str[i] is present before or not   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            // If the character is not present before, add it to resulting string   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
}


