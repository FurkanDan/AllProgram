
public class Re {
    public static void main(String[] args) {
        int num = 14;
        int temp = 0;
        while(num != 0){
        if(num%2 == 0){
            num = num/2;
        
        }else{
            num = num-1;
        }
    temp++;
    }
    System.out.println("the ans is "+temp);
    }
}
