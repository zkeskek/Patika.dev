import java.util.Scanner;

public class TekSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        int n,total=0;
        Scanner input=new Scanner(System.in);
        do{
            System.out.print("Sayi giriniz ");
            n=input.nextInt();
            if(n%4==0){
                total=total+n;}

        }while(n%2==0);
        System.out.println("Toplam: "+total); input.close();
    }
}
