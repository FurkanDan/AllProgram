import java.util.*;

public class Test {

    int a = 1;
    int b = 2;

    Test func(Test obj) {
        Test obj3 = new Test();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        return obj3;
    }

    static int searchElement(int[] arr) {

        int ans = -1;
        int n = arr.length;
        int x = 16;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        return ans;
    }

    static int maxValue(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void printKMultiple(int n, int k) {
        for (int i = 1; i <= k; i++) {
            int mult = n * i;
            System.out.println(mult);
        }
    }

    static int sumOfArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // int n = 12;
        // int k = 5;
        // printKMultiple(n, k);

        // int[] arr = { 1, 3, 4, 5, 6, 7, 8 };

        // printArray(arr);

        // System.out.println(sumOfArray(arr));
        // System.out.println(maxValue(arr));
        // System.out.println(searchElement(arr));

        Test obj1 = new Test();
        Test obj2 = obj1.func(obj1);

        System.out.println(&quot;obj1.a = &quot; + obj1.a + &quot; obj1.b = &quot; +obj1.b);
        System.out.println(&quot;obj2.a = &quot; + obj1.a + &quot; obj1.b = &quot; + obj2.b);
    }
}