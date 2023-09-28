package ReduceNo.java;
import java.util.Scanner;

public class ReduceNo {
    public static void main(String[] args) {
        // Scanner sc = new Sacnner(System.in);
        int num = 14;
        int temp = 0;

        if(num%2 == 0){
            num = num/2;
        temp++;
        }else{
            num = num-1;
        }
        System.out.println(temp);

    }
    
}
