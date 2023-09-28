import java.util.Scanner;
class Calculator{
    void add(int x,int y){
        int sum = x+y;
        System.out.println(sum);
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    float add(float x, float y,int z){
        return x+y+z;
    }
    double add(int x,double y, double z){
        return x+z;
    }
}


public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        cl.add(4,5.4,7.1);

    }
}
