public class PalindromikKelimleriBulanProgram {

    static boolean isPalindrome(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            char x = str.charAt(i);
            str1 = str1 + x;
        }
        if (str.equals(str1)) {
            System.out.println(str+" palindrom bir kelimedir. ");
            return true;

        }else{
            System.out.println(str+" palindrom bir kelime değildir. ");

        }
        return false;

    }

    public static void main(String[] args) {
        isPalindrome("asap");

    }
}
