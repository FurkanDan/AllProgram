// For this challenge, the input is a string of words, and the output should be the words in reverse but with the letters in the original order. For example, the string “Dog bites man” should output as “man bites Dog.”
import java.util.*;

public class test1 {

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == (n-1)/2 || j - i == (n-1)/2 || i == (n-1)/3 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // System.out.print(" ");
            // for (int j = 0; j < n; j++) {
            //     if (j == 0 && i <= (n - 1) / 2 || i==0 && j<(n-1)/2 || i==(n-1)/2&& j<=(n-1)/2) {
            //         System.out.print("* ");
            //     } else {
            //         System.out.print("  ");
            //     }
            // }
            System.out.println();

        }
    }

    // public static void ReverseString1(String s) {
    //     String[] words = s.split(" ");
    //     Collections.reverse(Arrays.asList(words));
    //     System.out.println(String.join(" ", words));

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        // String s = sc.nextLine();
        // ReverseString1(s);
        int n = sc.nextInt();
        printPattern(n);

    }

}
