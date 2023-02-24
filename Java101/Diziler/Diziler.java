import java.util.Arrays;

public class Diziler {
    public static void main(String[] args) {
        System.out.println("\nArabalar.............................");
        String[] arabalar = { "BMW", "Mercedes", "Ford", "Ferrari" };
        for (String i : arabalar) {
            System.out.println(i);
        }
        System.out.println("\nİki boyutlu matris.............................");

        int[][] matris = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        for (int[] u : matris) {
            System.out.println();
            for (int elem : u) {
                System.out.print(elem + " ");
            }
        }
        System.out.println();
        System.out.println("\nDizinin yeniden tanimlanması.............................");
        int[] scores = new int[10];
        System.out.println("\nscores boyutu: " + scores.length);
        for (int score : scores) {
            System.out.print(score + "  ");
        }
        scores = new int[3];
        System.out.println("\nscores boyutu: " + scores.length);
        for (int score : scores) {
            System.out.print(score + "  ");
        }
        scores = new int[] { 215, 234, 218, 189, 221, 290 };

        System.out.println("\nscores boyutu: " + scores.length);

        for (int score : scores) {
            System.out.print(score + "  ");
        }

        System.out.println("\nDiziyi ekrana yazdırma.............................");
        System.out.println(Arrays.toString(scores));

        System.out.println("\nDizinin elemanlarnı değiştirme.............................");
        int[] liste = { 15, 1, 99, 34, 8, -22, 11, 2, -49, 52 };
        System.out.println("dizinin önceki hali " + Arrays.toString(liste));
        Arrays.fill(liste, 2);
        System.out.println("dizinin sonraki hali " + Arrays.toString(liste));

        int[] liste2 = { 15, 1, 99, 34, 8, -22, 11, 2, -49, 52 };
        System.out.println("dizinin önceki hali " + Arrays.toString(liste2));
        Arrays.fill(liste2, 3, 5, 7);
        System.out.println("dizinin sonraki hali " + Arrays.toString(liste2));

        System.out.println("\nDizinin elemanlarnı sıralama.............................");
        Arrays.sort(liste2);
        System.out.println(Arrays.toString(liste2));

        System.out.println("\nDizinin elemanının indeksini.............................");
        int[] liste3 = { 6, 1, 55, 21, 33, -321, -21, 2, -11, 27 };
        System.out.println(Arrays.toString(liste3));
        int index = Arrays.binarySearch(liste3, 33);
        System.out.println("33'ün indeksi :" + index);

        int index1 = Arrays.binarySearch(liste2, 10);
        System.out.println("10'ün indeksi :" + index1);
        Arrays.sort(liste3);
        System.out.println(Arrays.toString(liste3));

        index = Arrays.binarySearch(liste3, 33);
        System.out.println("33'ün indeksi :" + index);

        index1 = Arrays.binarySearch(liste2, 10);
        System.out.println("10'ün indeksi :" + index1);

        System.out.println("\nDizilerin eşitliği.............................");
        int[] list1 = { 1, 2, 3 };
        int[] list2 = { 1, 2, 3 };
        int[] list3 = { 1, 2, 10 };
        System.out.println("List1: " + Arrays.toString(list1));
        System.out.println("List2: " + Arrays.toString(list2));
        System.out.println("List3: " + Arrays.toString(list3));

        System.out.println("equals(list1,list2): " + Arrays.equals(list1, list2)); // true

        System.out.println("equals(list2,list3): " + Arrays.equals(list2, list3)); // false

        System.out.println("\nDizinin ortalaması.............................");

        int[] numbers = {7, 2, 6, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println(sum / numbers.length);

    }

}
