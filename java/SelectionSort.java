public class SelectionSort {

    static void sortFruit(String[] fruit){
        int n = fruit.length;
        for(int i=0; i<n-1; i++){
        int min_Index = i;
        for(int j=i+1; j<n; j++){
            if(fruit[j].compareTo(fruit[min_Index]) < 0){
                min_Index = j;
            }
        }
        int temp = fruit[i];
            fruit[i]= fruit[min_Index] ;
            


        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 9, 4, 67, 23 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
