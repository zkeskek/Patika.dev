public class TersUcgenYapimi {
    public static void main(String[] args) {
        int n = 10;
        for (int i = n; i >0; i--) {

            for (int j = 1; j <=n - i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k < n + i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
