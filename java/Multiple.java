import java.util.Scanner;

public class Multiple {

    static void printMultiple(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        printMultiple(n, k - 1);

        System.out.println(n * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter K multiple: ");
        int k = sc.nextInt();

        printMultiple(n, k);
        

    }
