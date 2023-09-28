
class Car implements Runnable{
    
    public void run() {
        try{
        System.out.println(Thread.currentThread().getName()+"Has enter the parking lot");
        Thread.sleep(1000);
        synchronized(this){
        System.out.println(Thread.currentThread().getName()+"Got  the car ");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"drive the car");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"Started to drive the car");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"come back to the paking lot");
        Thread.sleep(1000);
        }
    }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}

public class LaunchMultithreading {
    public static void main(String[] args) {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Son-1 ");
        t2.setName("Son-2 ");
        t3.setName("Son-3 ");

        t1.start();
        t2.start();
        t3.start();

    }
}
