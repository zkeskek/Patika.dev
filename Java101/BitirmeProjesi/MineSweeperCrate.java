public class MineSweeperCrate {
    int x;
    int y;
    int indexx;
    int indexy;

    MineSweeperCrate(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int[][] mineSweeperMiror(int x, int y) {
        int mineNumber = 0;
        int[][] mineSweep = new int[this.x][this.y];
        for (int i = 0; i < mineSweep.length; i++) {
            for (int j = 0; j < mineSweep[0].length; j++) {
                mineSweep[i][j] = 0;

            }
        }
        for (int i = 0; i < mineSweep.length; i++) {
            System.out.println();
            for (int j = 0; j < mineSweep[0].length; j++) {
                System.out.printf("%1$3d", mineSweep[i][j]);
            }
        }

        return mineSweep;
    }

    public int[][] mineSweeper(int x, int y) {

        int mineNumber = 0;
        int[][] mineSweep = new int[this.x][this.y];
        while (mineNumber < (this.x * this.y) / 4) {
            int x1 = (int) (Math.random() * this.x);
            int y1 = (int) (Math.random() * this.y);
            if (mineSweep[x1][y1] != -1) {
                mineSweep[x1][y1] = -1;
                mineNumber++;
            }
        }

        for (int i = 0; i < mineSweep.length; i++) {
            for (int j = 0; j < mineSweep[0].length; j++) {
                if (mineSweep[i][j] == -1) {
                    for (int k = -1; k < 2; k++) {
                        for (int m = -1; m < 2; m++) {
                            if ((i + k) >= 0 && (i + k) < mineSweep.length && (j + m) >= 0
                                    && (j + m) < (mineSweep[i].length)) {
                                if (mineSweep[i + k][j + m] != -1) {
                                    mineSweep[i + k][j + m] = mineSweep[i + k][j + m] + 1;

                                }
                            }
                        }
                    }
                }

            }

        }

        
        return mineSweep;

    }

}
