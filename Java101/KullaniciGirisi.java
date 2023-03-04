import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınız:");
        userName = input.nextLine();
        
      System.out.println(userName);
        
        if (userName.equals("abcd")) {
            System.out.print("Şifreniz:");
            password = input.nextLine();
            if (password.equals("1234")) {
                System.out.println("Giriş yapıldı");

            } else {
                System.out.println("Şifre hatalı şifreyi sıfırlayacakmısınız y-n");
                String y = input.nextLine();
                if (y.equals("y")) {
                    System.out.print("Yeni şifreyi giriniz ");
                    password = input.nextLine();
                    if (password.equals("1234")) {
                        System.out.println("Şifre oluşturulamadı");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }

                }
            }

        } else {
            System.out.println("Kullanıcı ismi hatalı");
        }
        input.close();
    }
}
