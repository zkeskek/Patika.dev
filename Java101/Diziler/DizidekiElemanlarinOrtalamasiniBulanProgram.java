public class DizidekiElemanlarinOrtalamasiniBulanProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 7, 9, 4, 5};
        int sum = 0;
        double har=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        for (int i = 0; i < numbers.length; i++) {
            har += (double)1/numbers[i];
        }

        System.out.println("Ortalama: "+sum / numbers.length);
        System.out.println("Harmonik Ortalama: "+numbers.length/har);
    }
}
