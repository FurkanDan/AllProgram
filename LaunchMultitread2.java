
public class LaunchMultitread2 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println("the thread name is: "+name);
        System.out.println("Thread priority is: "+Thread.currentThread().getPriority()); 

        System.out.println("After changng:");
        Thread t = Thread.currentThread();
        t.setName("pw");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        int p1 = Thread.currentThread().getPriority();
        System.out.println("Thread name is: "+name1);
        System.out.println("The thread priority is: "+p1);

    }
}
