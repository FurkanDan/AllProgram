import java.util.*;
public class LaunchArrayCollection {
    public static void main(String[] args) {
        
        ArrayList al1 = new ArrayList();
        al1.ensureCapacity(10);
        al1.add(300);
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(300);
        al1.add(100);
        al1.add(200);
        al1.add(300);
        

            System.out.println(al1.contains(300));
            System.out.println(al1.size());
            System.out.println(al1.isEmpty());
            System.out.println(al1.get(5));

            
            al1.trimToSize();
            
            al1.clear();
            System.out.println(al1.size());
            
            

        // System.out.println(al1);
        // System.out.println("*****************************************");

        // ArrayList al2 = new ArrayList();
        // al2.add(1);
        // al2.add(22.2);
        // al2.add('j');
        //     System.out.println(al2);
        //     System.out.println("***********************************");
        //     al2.addAll(al1);
        //     System.out.println(al2);
        //     System.out.println("***********************");
        //     al2.add(2,"pw");
        //     System.out.println(al2);
        //  al2.get(2);
        //     System.out.println(al2.get(2));
        
    }
}
