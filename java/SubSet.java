public class SubSet {

    void subSetSum(int[] arr, int n, int idx, int sum) {
        if (idx >= n) {
            System.out.println(sum);
            return;
        }
        subSetSum(arr, n, idx + 1, sum + arr[idx]);

        subSetSum(arr, n, idx + 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5 };
        SubSet obj1 = new SubSet();
        obj1.subSetSum(arr, arr.length, 0, 0);
    }

}
