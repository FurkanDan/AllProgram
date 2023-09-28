import java.util.*;

class Library implements Runnable{
    String res1 =new String("JAVA");
    String res2 =new String("SQL");
    String res3 =new String("DSA");

    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("std1")){
            
            try{
                Thread.sleep(2000);
                synchronized(res1){
                    System.out.println("srd 1 acc "+res1);
                    Thread.sleep(2000);
                    synchronized(res2){
                        System.out.println("std1 acc "+ res2);
                        Thread.sleep(2000);
                        synchronized(res3){
                            System.out.println("std1 acc "+res3);
                            Thread.sleep(5000);
                        }
                    }
                }

            }
            catch(Exception e){
                System.out.println("some problem");
            }
        }
        else{
            try{
                Thread.sleep(2000);
                synchronized(res1){
                    System.out.println("std2 acc "+res1);
                    Thread.sleep(2000);
                    synchronized(res2){
                        System.out.println("std2 acc "+ res2);
                        Thread.sleep(2000);
                        synchronized(res3){
                            System.out.println("std2 acc "+res3);
                            Thread.sleep(3000);
                        }
                    }
                }

            }
            catch(Exception e){
                System.out.println("some problem");
            }

        }

    }
}

public class LaunchMultithreading8 {
    public static void main(String[] args) {
        Library lb = new Library();
        Thread t1 = new Thread(lb);
        Thread t2 = new Thread(lb);


        t1.setName("std1");
        t2.setName("std2");

        t1.start();
        t2.start();
    }
}
