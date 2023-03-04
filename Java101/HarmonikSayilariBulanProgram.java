import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        int n;
        double harmonik=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            harmonik=harmonik+(double)1/i;
        }
System.out.println(n+" sayısının harmoniği: "+harmonik);
    }
}
