import java.util.Scanner;
public class Pattern{
    static void boarderPrint(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        // boarderPrint(n);
        for(int i=0; i<n; i++){
            for(int j=n; j>n-i; j--){
                System.out.print(" ");
                
            }
            System.out.print("*");
        }
        System.out.println(); 
    }
    
}
