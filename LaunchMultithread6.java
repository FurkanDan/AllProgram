import java.util.*;
class Mythread1 extends Thread{
    public void run(){
        String tname = Thread.currentThread().getName();
        if(tname.equals("clc")){
            clc();
        }else{
            message();
        }

    }
    public void clc(){
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
    public void message(){
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
    } 
}

public class LaunchMultithread6 {
    public static void main(String[] args) {
        Mythread1 thread1 = new Mythread1();
        Mythread1 thread2 = new Mythread1();

        thread1.setName("clc");
        thread2.setName("message");

        thread1.start();
        thread2.start();
    }
}
