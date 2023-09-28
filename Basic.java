import java.util.Scanner;

class Add{
    public int add(){
    int a = 10;
    int b = 20;
    int sum = a+b;
    return sum;
    }
}

public class Basic {

    public static void arrPrint(int[][] arr){
        System.out.println("the matrix is:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Add obj1 = new Add();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
    int arr[][] = new int[size1][size2];
        System.out.println("Enter the element in matrix:");
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++)
            arr[i][j] = sc.nextInt();
        }
        // int sum = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         System.out.print(arr[i][j]+" ");
        //         // System.out.println(arr[j]+" ");
        //     }
        //     System.out.print("\n");
        //     // sum = sum+arr[i];

        //     // System.out.println(i);
        // }
        // System.out.println(sum);
        arrPrint(arr);
        System.out.println(obj1.add());

    }
}


