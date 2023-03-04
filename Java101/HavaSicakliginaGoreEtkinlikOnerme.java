import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz :");
        sicaklik=input.nextInt();
        if(sicaklik<5){
            System.out.println("Kayağa gidebilirsiniz");
        }
        if(5<=sicaklik&&sicaklik<15){
            System.out.println("Sinamaya gidebilirsiniz");
        }
        if(15<=sicaklik&&sicaklik<25){
            System.out.println("Pikniğe gidebilirsiniz");
        }
        if(25<=sicaklik){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
