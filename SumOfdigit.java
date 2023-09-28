class Add{
    public void add(int a,int b){
       int sum = a+b;
       System.out.println(sum);
    }
}
public class SumOfdigit {
    public static void main(String[] args) {
        Add obj1 = new Add();
        int x = 10;
        int y = 12;
        obj1.add(x,y);
    }
}

