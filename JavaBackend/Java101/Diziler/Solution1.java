import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        int[] array=new int[n];
        int numberMinus=0;
        int result=0;
        for(int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(array[i]<0){
                numberMinus=numberMinus+1;
            };
        }
        
        for(int i=0;i<numberMinus;i++){
            result=result+n;
            n=n-1;
            
        }
        System.out.println(result);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}