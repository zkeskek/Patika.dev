public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Mağza");

    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağzaya Hoş Geldiniz !");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("----------------------------------");
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış yap");
            System.out.println("----------------------------------");
            System.out.print("Seçiminiz : ");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Geçersiz değer, tekrar giriniz : ");
                System.out.println("----------------------------------");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz !");
                    showMenu = false;
                    break;

            }

        }
        return true;
    }

    public void printWeapon() {

        System.out.println("----------------------------------");
        System.out.println("-------------Silahlar-------");

        for (Weapon w : Weapon.weapons()) {
            System.out.println(
                    w.getId() + " " + w.getName() + " < Para : " + w.getPrice() + " Hasar : " + w.getDamage() + " >");

        }
        System.out.println("0 - Çıkış yap");
        System.out.println("----------------------------------");

    }

    public void buyWeapon() {
        System.out.println("----------------------------------");
        System.out.print("Bir silah seçiniz veya çıkış yapınız : ");
        while (true) {

            int selectWeaponID = input.nextInt();

            while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
                System.out.println("Geçersiz değer, tekrar giriniz : ");
                selectWeaponID = input.nextInt();

            }

            if (selectWeaponID != 0) {

                Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

                if (selectedWeapon != null) {
                    if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                        System.out.println("Yeterli paranız bulunmamaktadır. ");
                    } else {
                        System.out.println(selectedWeapon.getName() + " silahını satın aldınız. ");
                        int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                        this.getPlayer().setMoney(balance);
                        System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                        this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    }

                    System.out.println("----------------------------------");
                    getPlayer().printInfo();
                    printWeapon();
                    System.out.print("Bir silah seçiniz veya çıkış yapınız : ");

                }
            } else {
                break;
            }
        }
    }

    public void printArmor() {
        System.out.println("----------------------------------");

        System.out.println("---------Zırhlar-----------");

        for (Armor a : Armor.armors()) {
            System.out.println(
                    a.getId() + " " + a.getName() + " < Para : " + a.getPrice() + " Zırh : " + a.getBlock() + " >");
        }
        System.out.println("0 - Çıkış yap");
        System.out.println("----------------------------------");

    }

    public void buyArmor() {
        System.out.println("----------------------------------");
        System.out.println("Bir zırh seçiniz  veya çıkış yapınız: ");

        while (true) {

            int selectArmorID = input.nextInt();
            while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
                System.out.println("Geçersiz değer, tekrar giriniz : ");
                selectArmorID = input.nextInt();
            }
            if (selectArmorID != 0) {
                Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

                if (selectedArmor != null) {
                    if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                        System.out.println("Yeterli paranız bulunmamaktadır. ");
                    } else {
                        System.out.println(selectedArmor.getName() + " zırhını satın aldınız. ");
                        int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                        this.getPlayer().setMoney(balance);
                        System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                        this.getPlayer().getInventory().setArmor(selectedArmor);
                    }

                    System.out.println("----------------------------------");
                    getPlayer().printInfo();
                    printArmor();
                    System.out.println("Bir zırh seçiniz  veya çıkış yapınız: ");

                }
            } else {
                break;
            }
        }
    }

}
