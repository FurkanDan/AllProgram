import javax.xml.transform.Source;

public class RemoveDuplicate {

      static int removeDuplicate(int[] arr){
        int n = arr.length;
        if(n == 0)
        return 0;
        int addIndex = 1;
        for(int i=0; i<n-1; i++){
            if(arr[i] < arr[i+1]){
                arr[addIndex] = arr[i+1];
            addIndex++;
            }
        }
        return addIndex;
      }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};

        int ans = removeDuplicate(arr);
        System.out.println(ans);
    }

    public void removeDuplicate(char[] ch, int n) {
    }
    
}
