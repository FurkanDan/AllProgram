import java.util.Scanner;

public class LaunchMultithread1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println(res);

        System.out.println("****************");

        for(int i=0; i<3;i++){
            System.out.println("*");
        }
        System.out.println("Practise is a good habbit to learn new Skill");

        for(int i=0; i<4; i++){
            System.out.println("Focus on your goal");
        }
    }
}
