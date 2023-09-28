import java.util.*;
class Demo{
    Scanner sc = new Scanner(System.in);
    void demo(){
        System.out.println("connection established");
        try{
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);

            System.out.println("Enter the size of array");
            int size = sc.nextInt();
            int arr[] = new int[size];

            System.out.println("Enter the element to be sored");
            int elem = sc.nextInt();
            System.out.println("Enter the postion at which element has to be stored");
            int pos = sc.nextInt();
            arr[pos] = elem;
            System.out.println(arr[pos]);
        }
        catch(ArithmeticException e){
            System.out.println("please provide non-zero denominator");
            
        }
        catch(NegativeArraySizeException f){
            System.out.println("provide positive array size");
        }
        catch(ArrayIndexOutOfBoundsException g){
            System.out.println("please provide index size within range: ");
        }
        catch(Exception h){
            System.out.println("Something went Wrong...");
        }
        System.out.println("connection is terminated");
        
}
}
public class ExceptionFirst {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.demo();


        // int a = 6; 
        // int b = 0;
        // int res = 0;
        // int arr[] = {4,5,6,7};
        // String name = null;
        // try{
        // res = a/b;
        // System.out.println(arr[4]);

        // }
        // catch(ArithmeticException e){
        //     System.out.println("cannot divide by 0 "+e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("index out of bound: ");
        // }
        // catch(Exception e){
        //     System.out.println("Somthing went wrong");
        // }
        // System.out.println("Result is "+res);
        // System.out.println("by....");
    }
}
