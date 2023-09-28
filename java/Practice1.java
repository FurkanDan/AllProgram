import java.util.Scanner;

public class Practice1 {

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void printNo(int n) {
        if (n == 0)
            return;

        printNo(n - 1);
        System.out.println(n + " ");
    }

    void printDecreasing(int n) {
        if (n == 0)
            return;

        System.out.println(n + " ");
        printDecreasing(n - 1);
    }

    int factorial(int n) {
        if (n == 1)
            return 1;

        int smallAns = factorial(n - 1);

        return n * smallAns;

    }

    int fibonacciSeries(int n) {

        if (n <= 1)
            return n;

        int smallAns = fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        return smallAns;

    }

    int sumOfDigit(int n) {
        if (n >= 0 && n <= 9)
            return n;

        int smallAns = sumOfDigit(n / 10);

        return smallAns + (n % 10);
    }

    int countDigit(int n) {
        if (n >= 0 && n <= 9)
            return 1;

        return countDigit(n / 10) + 1;
    }

    int pow(int p, int q) {
        if (q == 0)
            return 1;

        return pow(p, q - 1) * p;
    }

    void printMultiple(int n, int k) {
        if (k == 0)
            return;

        printMultiple(n, k - 1);

        System.out.println(n * k);

    }

    int alternativeSum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return alternativeSum(n - 1) - n;
        } else
            return alternativeSum(n - 1) + n;
    }

    int igcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    int sumOfNaturanNo(int n) {
        if (n == 0) {
            return 0;
        }
        int smallAns = n * (n - 1) / 2;
        return smallAns + n;
    }

    int[] prefixSum(int[] arr, int n) {
        int[] temp = new int[n];
        temp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            temp[i] = arr[i - 1] + arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice1 obj1 = new Practice1();

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        // System.out.println("Enter p and q:");

        // int p = sc.nextInt();
        // int q = sc.nextInt();

        // System.out.println("Enter number:");

        // int n = sc.nextInt();
        // for(int i=0; i<n; i++)

        // obj1.printNo(n);
        // obj1.printDecreasing(n);
        // System.out.println(obj1.factorial(n));
        // System.out.println(obj1.fibonacciSeries(i));

        // System.out.println(obj1.sumOfDigit(n));

        // System.out.println(obj1.countDigit(n));
        // System.out.println(obj1.pow(p, q));
        // obj1.printMultiple(p, q);
        // System.out.println(obj1.alternativeSum(n));

        // System.out.println(obj1.igcd(p,q));
        // System.out.println(obj1.gcd(p, q));

        // System.out.println(obj1.sumOfNaturanNo(n));
        int[] ans = obj1.prefixSum(arr, n);
        printArr(ans);

    }
}