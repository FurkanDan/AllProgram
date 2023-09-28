import java.util.*;
class Clc extends Thread{
    public void run(){
        System.out.println("Calculation Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int res = num1+num2;
        System.out.println("The result is: "+res);
        System.out.println("Calculation task ended");
        System.out.println("***********************************************");
    }
}
class Message extends Thread{
    public void run(){
        try{
            System.out.println("Display imprtat task");
        for(int i=0; i<3; i++){
            System.out.println("Focus is important mastars skill");
            Thread.sleep(2000);
        }
        System.out.println("Display important task ended");
        }
        catch(Exception e){
            System.out.println("Something went wrong...");
        }
    }
}

public class LaunchMultithread4 {
    public static void main(String[] args) {
        System.out.println("main thread");
        Clc t1 = new Clc();
        Message t2 = new Message();

        t1.start();
        t2.start();


    }
}
