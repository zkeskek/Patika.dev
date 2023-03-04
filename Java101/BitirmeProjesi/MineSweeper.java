import java.util.Scanner;

/**
 * MineSweeper
 */
public class MineSweeper {

    public static void main(String[] args) {

        int x, y;
        boolean oyn=false;
        Scanner input = new Scanner(System.in);
        System.out.println("Mayın tarlasına hoş geldiniz.");
        System.out.println("Mayın tarlası boyutlarını girin.");
        System.out.print("Boyu : ");
        x = input.nextInt();
        System.out.print("Genişliği : ");
        y = input.nextInt();
        int[][] ar = new int[x][y];
        int[][] armiror = new int[x][y];
        MineSweeperCrate mineSweeper = new MineSweeperCrate(x, y);
        MineSweperUI mineSweep = new MineSweperUI();
        ar = mineSweeper.mineSweeper(x, y);
        armiror = mineSweeper.mineSweeperMiror(x, y);
        boolean oyna = true;
        while (oyna) {
            System.out.println();
            System.out.print("Satır Giriniz : ");
            x = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            y = input.nextInt();
            System.out.println("=================================");
            oyna=mineSweep.mineSweperUI(x, y, ar, armiror,oyn);
                      
        }
        System.out.println("Game Over !!");
        input.close();

    }

}