public class InsertionSort {

    static void sort0(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] == 0 && arr[j+1] !=0 ){
                    int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                }
            }
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 5, 7, 8, 2, 4, 1, 3 };

        // insertionSort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        int[] arr = {0,5,0,3,42};

        sort0(arr);
        for(int n : arr){
             System.out.print(n+" ");
        }

    }
}
