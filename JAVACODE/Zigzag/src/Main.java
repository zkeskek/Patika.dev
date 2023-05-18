import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Main {
    
    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
             int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
   }
   
    public static void findZigZagSequence(int [] a, int n){
    	for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        Arrays.sort(a);
        int mid = (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid-1 ;
        int ed = n-1 ;
        

        while(st <= ed){
        	//System.out.println(st);
            //System.out.println(ed);
        	 System.out.println(a[st]+" "+a[ed]);
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            System.out.println(a[st]+" "+a[ed]);
            st = st + 1;
            ed = ed -1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
/*
1
7
1 2 3 4 5 6 7
 */
    }
}



