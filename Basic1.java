import java.util.Scanner;

class Addition{
    int add(int a,int b){
        int sum = a+b;
        return sum;
    }
}

public class Basic1 extends Addition{ 
    
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        // Addition obj1 = new Addition()
        Basic1 obj1 = new Basic1();
    System.out.println("Enter any number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(obj1.add(a,b)); 

    // int n = sc.nextInt()
    // if(n>=0){
    //     System.out.println(n);
    // }else{
    //     n = n * -1;
    //     System.out.println(n);
    // }
    
    }
}

