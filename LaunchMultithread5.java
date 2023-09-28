import java.util.*;
class Clc implements Runnable{
    public void run(){
        System.out.println("Claculation task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        int res = a*b;
        System.out.println("the result is "+res);
        System.out.println("Calculation task ended");
        System.out.println("***********************************************");

    }
}
class Message implements Runnable{
    public void run(){
        System.out.println("Display important message");
        try{
            for(int i = 0; i<4; i++){
                System.out.println("Practise is important to learn new skill");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        // System.out.println("**************************************");
        // System.out.println("message is complete");
    }

}

public class LaunchMultithread5 {
    public static void main(String[] args) {
        Clc x = new Clc();
        Message y = new Message();

        Thread t1 = new Thread(x);
        Thread t2 = new Thread(y);

        t1.start();
        t2.start();
    }
}
