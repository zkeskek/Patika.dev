import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        int[] array=new int[n];
        int minusLine=0;
       
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        int total=0;
           for(int i=0;i<n;i++){
               for(int j=i;j<n;j++){
                   total=total+array[j];
                   if(total<0){
                       minusLine=minusLine+1;
                   }
               }
               total=0;
           }
        System.out.println(minusLine);
        input.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}