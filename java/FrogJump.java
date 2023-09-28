public class FrogJump {

    int frogJump(int[] h, int n, int idx) {
        if (idx == n - 1) {
            return 0;
        }
        int opt1 = Math.abs(h[idx] - h[idx + 1]) + frogJump(h, n, idx + 1);
        if (idx == n - 2) {
            return opt1;
        }
        int opt2 = Math.abs(h[idx] - h[idx + 2]) + frogJump(h, n, idx + 2);

        return Math.min(opt1, opt2);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 40, 20 };
        int n = arr.length;
        FrogJump obj1 = new FrogJump();
        System.out.println(obj1.frogJump(arr, n, 0));
    }
}
