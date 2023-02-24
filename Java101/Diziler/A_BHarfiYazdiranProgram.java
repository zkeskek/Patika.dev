public class A_BHarfiYazdiranProgram {
    public static void main(String[] args) {
        String[][] letterA = new String[7][4];
        String[][] letterB = new String[7][4];

        for (int i = 0; i < letterA.length; i++) {
            for (int j = 0; j < letterA[i].length; j++) {
                if (i == 0 && j != 0 && j != 3 || i == 3) {
                    letterA[i][j] = " * ";
                } else if ((j == 0 || j == 3) && i != 0) {
                    letterA[i][j] = " * ";
                } else {
                    letterA[i][j] = "   ";
                }
            }
        }
        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if ((i == 0 || i == 3 || i == 6) && (j != 3)) {
                    letterB[i][j] = " * ";
                } else if (j == 0 || (j == 3 && (i != 0 && i != 6 && i != 3))) {
                    letterB[i][j] = " * ";
                } else {
                    letterB[i][j] = "   ";
                }
            }
        }
        System.out.println("...........A..........");

        for (String[] row : letterA) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("...........B..........");
        for (String[] row : letterB) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
