import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {

        int[] game0 = new int[game.length];
        boolean ileri = true, geri = true;
        if (leap == 0)
            return false;
        for (int i = 0; i < game.length;) {
            if (game[i] == 0) {

                if (i + leap >= game.length) {
                    return true;
                } else {
                    if (game[i + leap] == 0) {
                        i = i + leap;
                        ileri = true;
                        geri = true;
                    } else {
                        if (leap == 1) {
                            return false;
                        }
                        if (i - 1 >= 0 && geri) {
                            if (game[i - 1] == 0 && geri) {
                                i = i - 1;
                            } else {
                                geri = false;
                            }

                        } else {
                            geri = false;
                            if (i + 1 >= game.length) {
                                return true;
                            } else {
                                if (game[i + 1] == 0 && ileri) {
                                    i = i + 1;
                                } else {
                                    return false;
                                }
                            }
                        }
                    }

                }
            } else {
                return false;
            }

        }
        return false;
        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
