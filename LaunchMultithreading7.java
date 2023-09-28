import java.util.*;

class Printing implements Runnable{
        public void run(){
            try{
                for(int i=0; i<4; i++){
                    System.out.println("Focus is important");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }
        }
}

public class LaunchMultithreading7 {
    public static void main(String[] args) throws Exception {
        Printing thread1 = new Printing();

        Thread t1 = new Thread(thread1);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        // System.out.println(Thread.alive());

        System.out.println("Main thread is finish the work: ");
    }
}
