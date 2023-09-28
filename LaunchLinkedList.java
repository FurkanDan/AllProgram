import java.util.*;

public class LaunchLinkedList {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);

        System.out.println(ll1);

        LinkedList ll2 = new LinkedList();

        ll2.add(1);
        ll2.add("skill");
        ll2.add('j');

        System.out.println(ll2);

        LinkedList ll3 = new LinkedList();

        ll3.add(400);
        ll3.add(122);
        ll3.add(499);
        ll3.add(3,"pw");

        System.out.println(ll3);
        ll3.addFirst("Danish");
        ll3.addLast(100);

        System.out.println(ll3.peek());
        System.out.println(ll3);
        System.out.println(ll3.pop());
        System.out.println(ll3); 
    }
}
