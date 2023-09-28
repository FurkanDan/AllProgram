import java.util.Scanner;

public class SeriesSum {

    static int seriesSum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return seriesSum(n - 1) - n;
        } else {
            return seriesSum(n - 1) + n;
        }
    }

    static int seriesSum1(int n) {
        if (n == 0) {
            return 0;
        }

        return seriesSum1(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(seriesSum1(n));
        System.out.println(seriesSum(n));
    }
}