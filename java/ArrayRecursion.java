

public class ArrayRecursion {

    static void findAllIdex(int[] arr, int target, int idx){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == target){
            System.out.println(idx);
        }
        findAllIdex(arr, target, idx+1);
    }



    // Find index where target is present
    static int findIndex(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return findIndex(arr, target, idx + 1);
    }

    // if target is present in the array return terue if not then false

    static boolean search(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == target)
            return true;

        return search(arr, target, idx + 1);
    }

    // Find sum of array

    static int sumOfArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int sum = sumOfArray(arr, idx + 1);

        return arr[idx] + sum;
    }

    //   find max element present in Array
    static int maxArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = maxArray(arr, idx + 1);

        return Math.max(arr[idx], smallAns);
    }

    //  print array using recursion
    static void printArray(int[] arr, int Idx) {
        if (arr.length == Idx) {
            return;
        }
        System.out.println(arr[Idx]);
        printArray(arr, Idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6,4,4,7,4 };
        int target = 4;
        // printArray(arr, 0);

        // System.out.println(maxArray(arr, 0));

        // System.out.println(sumOfArray(arr, 0));

        // if(search(arr, target, 0)){
        // System.out.println("True");
        // }else{
        // System.out.println("False");
        // }

        // System.out.println(findIndex(arr, target, 0));

         findAllIdex(arr, target, 0);
    }
}