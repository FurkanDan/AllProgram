import javax.xml.transform.Source;

public class PangramString {
    public static void main(String[] args) {

            boolean flag = false;

        String s1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        s1 = s1.replace(" ", "");
        char ch[] = s1.toCharArray();
        int arr[] = new int[26];

        for(int i=0; i<ch.length; i++){
            arr[ch[i] - 65]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                System.out.println("Given string is not Pangram");
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Given String is Pangram");
        }
    }
}
