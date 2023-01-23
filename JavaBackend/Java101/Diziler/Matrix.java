
public class Matrix {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];
        int number = 1;

        for (int x = 0; x < matrix.length; x++) {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++) {
                row[y] = number;
                number++;
            }
        }
        // ekrana yazdırma
        System.out.println(".........................");

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();

        }
        // başka bir şekilde ekrana yazdırma
        System.out.println(".........................");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int[][] numbers;
        //numbers={{1,2},{1},{2}}; dogru
        numbers = new int[3][];
        numbers[0]=new int[2];
        //numbers[0]={1,2}; yanlış
        System.out.println(numbers[0][1]);
    }
}