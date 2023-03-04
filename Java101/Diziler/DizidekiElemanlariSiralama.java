import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();
        int[] dizi=new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i=0;i<n;i++){      
            System.out.print(i+1+". elemanı : ");

        dizi[i] = input.nextInt();
        }
        //System.out.println(Arrays.toString(dizi));
        //System.out.println("Dizi sırala:");
        Arrays.sort(dizi);
        System.out.println("Sıralama: "+Arrays.toString(dizi));
        input.close();
    }
}
