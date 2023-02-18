import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("----------------------------------");
        System.out.println("Macera oyununa hoş geldiniz !");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = input.nextLine();
        playerName = "zeki";
        Player player = new Player(playerName);
        System.out.println("----------------------------------");
        System.out.println("Sayın " + player.getName() + " Bu karanlıklı ve sisli adaya hoş geldiniz !");
        System.out.println("----------------------------------");
        player.selectChar();
        System.out.println("----------------------------------");

        Location location = null;
        while (true) {
            System.out.println("----------------------------------");
            player.printInfo();
            System.out.println("----------------------------------");

            System.out.println("----------------BÖLGELER--------------");
            System.out.println("1 - Güvenli Ev -->Burası sizin için güvenli bir ev, düşman yok");
            System.out.println("2 - Eşya Dükkanı --> Silah ve Zırh satın alabilirsiniz.");
            System.out.println("3 - Mağara --> Ödül <Yemek> Dikkatli ol! Zombi çıkabilir !");
            System.out.println("4 - Orman --> Ödül <Odun> Dikkatli ol! Vampir çıkabilir !");
            System.out.println("5 - Nehir --> Ödül <Su> Dikkatli ol! Ayı çıkabilir !");
            System.out.println("0 - Çıkış yap - Oyunu solandır.");
            System.out.println("----------------------------------");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seciniz : ");
            int selectLoc = input.nextInt();
            System.out.println("----------------------------------");

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;

                case 2:
                    location = new ToolStore(player);
                    break;

                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;

                default:
                    System.out.println("Lütfen geçerli bir değer giriniz.");
                    
            }
            if (location == null) {
                System.out.println("Bu sisli ve karanlık adadan çabuk vazgeçtiniz ! ");
                System.out.println("----------------------------------");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("Game over");
                System.out.println("----------------------------------");

                break;
            }
        }

    }
}
