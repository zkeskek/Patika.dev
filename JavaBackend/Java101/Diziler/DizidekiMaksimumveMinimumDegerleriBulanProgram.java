import java.util.Arrays;
import java.util.Scanner;

public class DizidekiMaksimumveMinimumDegerleriBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();
        input.close();
        int[] list = new int[15];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("..........dizinin sıralanması...........");

        System.out.println(Arrays.toString(list));
        int min = list[0];
        int max = list[0];
        int highNumber = 100;
        int lowNumber = 0;

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            if (i > number && i < highNumber) {
                highNumber = i;
            }
            if (i < number && i > lowNumber) {
                lowNumber = i;
            }

        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
        System.out.println(number + " sayısına yakın küçük değer " + lowNumber);
        System.out.println(number + " sayısına yakın büyük değer " + highNumber);

    }
}
