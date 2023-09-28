import java.util.Scanner;

class second {
    int sod(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        int smallAns = sod(n / 10);
        return smallAns + 1;
    }

    void targetSum(int[] arr) {

        int size = arr.length;
        int k = 10;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

}

public class firstprogram {

    // static void targetSum(int[] arr) {

    // int size = arr.length;
    // int k = 10;
    // for (int i = 0; i < size; i++) {
    // for (int j = i + 1; j < size; j++) {
    // if (arr[i] + arr[j] == k) {
    // System.out.println(i+" "+ j);
    // }
    // }
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 4, 7, 8, 4, 2 };
        int n = 123456;

        second obj1 = new second();
        System.out.println("Sum is: " + obj1.sod(n));

        obj1.targetSum(arr);

    }

}
