public class MineSweperUI {

    boolean mineSweperUI(int x, int y, int[][] ar, int[][] armiror, boolean oyn) {
        armiror[x][y] = 1;
        if (ar[x][y] == -1) {
            return false;
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if (ar[i][j] != -1) {
                    for (int k = -1; k < 2; k++) {
                        for (int m = -1; m < 2; m++) {
                            if ((i + k) >= 0 && (i + k) < ar.length && (j + m) >= 0
                                    && (j + m) < (ar[i].length)) {
                                if (ar[i + k][j + m] == 0) {
                                    armiror[i + k][j + m] = 1;

                                }
                            }
                        }
                    }
                }

            }

        }

        System.out.print("    ");
        for (int j = 0; j < ar[0].length; j++) {
            System.out.printf("%1$3d", j);
        }
        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%1$3d:", i);
            for (int j = 0; j < ar[0].length; j++) {
                if (armiror[i][j] == 0) {
                    System.out.printf("%1$3s", "-");
                } else {
                    System.out.printf("%1$3d", ar[i][j]);
                }

            }
            System.out.println();

        }
        int total = ((x * y) - ((x * y) / 4));
        int a = 0;
        for (int i = 0; i < armiror.length; i++) {
            for (int j = 0; j < armiror[0].length; j++) {
                if (total == a) {
                    
                    oyn=true;
                } else {
                    a = a + 1;
                }

            }
        }
        return true;

    }

}
