import java.util.Scanner;

public class UsHesabiYapanProgram {
    static int square(int a,int b){
        
        if(b<1) {return 1;}
        
        return square(a, b-1)*a;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int a=input.nextInt();        
        System.out.println("Üs değerini giriniz: ");
        int b=input.nextInt();
        int x=square(a, b);
        System.out.println("sonuç: "+x); input.close();
    }
}
