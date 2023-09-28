
interface A{
    void show();
    default void dog(){
        System.out.println("dog can run");
    }
}

// class B implements A{
//     public void show(){
//         System.out.println("The show");
//     }
// }

public class DemoInterface{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("the show");
            }
        };
        obj.show();
        // obj.dog();
        
    }
}
