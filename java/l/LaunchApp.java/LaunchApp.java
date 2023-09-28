import java.util.*;
class Rectangle{
    float length;
    float breadth;
    float area;

    public void Input(){
        System.out.println("Calculation of Rectangle app");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter length of rectangle");
        length = sc.nextFloat();

        System.out.println("please enter breadth of rectangle");
        breadth = sc.nextFloat();
    }

    public void cal(){
        area = length * breadth;
    }

    public void disp(){
        System.out.println("The area of rectangle is " + area);
    }
}

class Square{
    float length;
    float area;

    public void Input(){
        System.out.println("Calculation of Square app");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter length of square");
        length = sc.nextFloat();

    }

    public void cal(){
        area = length * length;
    }

    public void disp(){
        System.out.println("The area of square is " + area);
    }
}

class Circle{
    float radius;
    float area;

    public void Input(){
        System.out.println("Calculation of Circle app");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter radius of circle");
        radius = sc.nextFloat();

    }

    public void cal(){
        area = 3.14f * radius * radius;
    }

    public void disp(){
        System.out.println("The area of circle is " + area);
    }
}

public class LaunchApp{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        rec.Input();
        rec.cal();
        rec.disp();

        Square sq = new Square();
        sq.Input();
        sq.cal();
        sq.disp();

        Circle ci = new Circle();
        ci.Input();
        ci.cal();
        ci.disp();


    }
} 
