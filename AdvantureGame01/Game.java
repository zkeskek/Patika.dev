
import java.util.Random;
import java.util.Scanner;

import Player.*;
import Tools.Armors;
import Tools.Gun;
import Tools.Rifle;
import Tools.Sword;
import Tools.Weapons;
import Location.*;
import Monstar.Bear;
import Monstar.Monstar;
import Monstar.Snake;
import Monstar.Vampire;
import Monstar.Zombie;

public class Game {

    private int totalDemage;
    private int block;
    private int totalMonstar;
    private boolean isMonstar = false;
    static Scanner input = new Scanner(System.in);

    Location location1 = new Location();
    Weapons weapon1 = new Weapons();
    Armors armor1 = new Armors();
    Iventory iventory1 = new Iventory();
    Monstar[] monstars = { new Zombie(), new Vampire(), new Bear(), new Snake() };

    public void start() {
        System.out.println("----------------------------------------------------------");
        System.out.println("********* Oyuna hoş geldiniz. ***********");
        System.out.println("----------------------------------------------------------");

        selectPlayer();

        show(0);
        selectChar();

        selectMonstar();
        selectLocation();

    }

    public void selectPlayer() {

        System.out.println("-- Kullanıcı oluşturma -------------------");
        System.out.println("----------------------------------------------------------");
        System.out.print("Kullanıcı isminizi giriniz : ");
        String name = input.nextLine();
        iventory1.setPlayerName(name);
        System.out.println(name + " adındaki kullanıcı oluşturuldu.");
    }

    public void selectChar() {
        System.out.println("-- Karakter seçimi -------------------");
        System.out.println("----------------------------------------------------------");
        Player[] charList = { new Samurai(), new Archer(), new Knight() };
        int selectChar = 0;
        while (selectChar < 1 || selectChar > charList.length) {
            System.out.println("1 : Samurai, 2: Archer, 3: Knight ");
            System.out.print("Lütfen bir karakter seçiniz : ");
            selectChar = input.nextInt();
            if (!(selectChar >= 1 && selectChar <= charList.length)) {
                System.out.println("Seçiminiz yanlış. Tekrar deneyiniz. ");
            } else {
                iventory1.setCharName(charList[selectChar - 1].getCharName());
                iventory1.setHealth(charList[selectChar - 1].getHealth());
                iventory1.setOriginalHealth(charList[selectChar - 1].getHealth());
                iventory1.setDemage(charList[selectChar - 1].getDemage());
                iventory1.setMoney(charList[selectChar - 1].getMoney());
                System.out.println(iventory1.getCharName() + " karakteri seçildi.");
            }
        }
    }

    public void selectMonstar() {
        // System.out.println("-- Canavar seçimi-------------------");
        Random r = new Random();
        monstars[0].setTotal((r.nextInt(3) + 1));
        monstars[1].setTotal((r.nextInt(3) + 1));
        monstars[2].setTotal((r.nextInt(3) + 1));
        monstars[3].setTotal((r.nextInt(5) + 1));
    }

    public void showMonstar() {
        for (int i = 0; i < monstars.length; i++) {
            System.out.println("id:" + monstars[i].getId() + ", name:" + monstars[i].getName() + ", demage:"
                    + monstars[i].getDemage() + ", Health:" + monstars[i].getHealth() + ", money:"
                    + monstars[i].getMoney() + ", total:" + monstars[i].getTotal());
            monstars[i].getId();
        }
    }

    public void selectLocation() {

        Location[] locationList = { new SafeHouse(), new ToolStore(), new Cave(), new Forest(), new River(),
                new Mine() };
        int selectLoc = 0;
        while (true) {

            show(0);
            System.out.println("-- Yer seçimi -------------------");
            System.out.println("----------------------------------------------------------");
            System.out.println("0 : Çıkış, 1 : Safe House, 2: Tool Store, 3: Cave, 4: Forest, 5: River, 6: Mine");
            System.out.print("Lütfen bir yer seçiniz : ");
            selectLoc = input.nextInt();
            if (selectLoc == 0) {

                System.out.println("Oyunu erken bitirdiniz. Bir daha bekleriz.");
                break;
            }
            if (!(selectLoc > 0 && selectLoc <= locationList.length)) {

                System.out.println("Seçiminiz yanlış. ");
            } else {
                location1 = locationList[selectLoc - 1];
            }

            switch (selectLoc) {
                case 1:

                    iventory1.setHealth(iventory1.getOriginalHealth());
                    System.out.println("Safe House'desiniz. Canınız fullendi.");
                    gameOver();
                    break;
                case 2:
                    show(0);
                    buyTools();
                    break;
                case 3:

                    if (monstars[0].getTotal() <= 0) {
                        System.out.println("Mağarada canavar kalmadı buraya giremezsisniz.");
                        break;
                    } else {

                        battle(0);
                    }
                    break;
                case 4:

                    if (monstars[1].getTotal() <= 0) {
                        System.out.println("Ormanda canavar kalmadı buraya giremezsisniz.");
                        break;
                    }
                    battle(1);
                    break;
                case 5:

                    if (monstars[2].getTotal() <= 0) {
                        System.out.println("Irmakta canavar kalmadı buraya giremezsisniz.");
                        break;
                    }
                    battle(2);
                    break;
                case 6:

                    if (monstars[3].getTotal() <= 0) {
                        System.out.println("Madende canavar kalmadı buraya giremezsisniz.");
                        break;
                    }
                    battle(3);
                    break;
                default:
                    break;
            }
        }
    }

    public void buyTools() {

        int selectTool = 0;
        while (selectTool < 1 || selectTool > 2) {
            show(0);
            System.out.println("-- Silah zırh satın alma -------------------");
            System.out.println("----------------------------------------------------------");
            System.out.println("0 : Çıkış, 1 : Silah, 2: Zırh");
            System.out.print("Lütfen Silah veya Zırh seçiniz : ");
            selectTool = input.nextInt();
            if (!(selectTool > -1 && selectTool < 3)) {
                System.out.println("Seçiminiz yanlış. ");
            } else {
                if (selectTool == 0) {
                    System.out.println("Hiç silah veya zırh almadınız.");
                    break;
                }
                if (selectTool == 1) {
                    buyWeapon();
                    System.out.println(weapon1.getName() + " satın aldınız.");
                }
                if (selectTool == 2) {
                    buyArmor();
                    System.out.println(armor1.getName() + " satın aldınız.");
                }
            }
        }
    }

    public void buyWeapon() {

        Weapons[] weaponList = { new Gun(), new Sword(), new Rifle() };

        int selectWeapon = 0;
        while (selectWeapon < 1 || selectWeapon > weaponList.length) {
            show(0);
            System.out.println("-- Silah satın alma -------------------");
            System.out.println("----------------------------------------------------------");
            System.out.println("0 : Çıkış, 1 : Gun (" + weaponList[0].getMoney() + ") , 2: Sword("
                    + weaponList[1].getMoney() + "), 3: Rifle (" + weaponList[2].getMoney() + ")");
            System.out.print("Lütfen bir silah seçiniz : ");
            selectWeapon = input.nextInt();

            if (!(selectWeapon > 0 && selectWeapon <= weaponList.length)) {
                System.out.println("Seçiminiz yanlış. Tekrar deneyiniz. ");
            } else if (iventory1.getMoney() > weaponList[selectWeapon - 1].getMoney()) {
                int oldWeaponDamage = weapon1.getDemage();
                weapon1 = weaponList[selectWeapon - 1];
                iventory1.setMoney(iventory1.getMoney() - weapon1.getMoney());
                iventory1.setWeaponName(weapon1.getName());
                totalDemage = iventory1.getDemage() + weapon1.getDemage() - oldWeaponDamage;
                iventory1.setDemage(totalDemage);

                System.out.println(weapon1.getName() + " silahını satın aldınız.");

            } else {
                System.out.println(" Paranız yeterli değil.");
            }

        }
    }

    public void buyArmor() {

        Armors[] armorList = new Armors[3];
        armorList[0] = new Armors(1, "lightArmor", 1, 15);
        armorList[1] = new Armors(2, "midleArmor", 3, 25);
        armorList[2] = new Armors(3, "hardArmor", 5, 40);
        int selectArmor = 0;
        while (selectArmor < 1 || selectArmor > armorList.length) {
            show(0);
            System.out.println("-- Zırh satın alma -------------------");
            System.out.println("----------------------------------------------------------");
            System.out.println("0 : Çıkış, 1 : Hafif (" + armorList[0].getMoney() + ") , 2: Orta("
                    + armorList[1].getMoney() + "), 3: Güçlü (" + armorList[2].getMoney() + ")");

            System.out.print("Lütfen bir Zırh seçiniz : ");
            selectArmor = input.nextInt();

            if (selectArmor == 0) {
                break;
            }
            if (!(selectArmor > 0 && selectArmor <= armorList.length)) {
                System.out.println("Seçiminiz yanlış. Tekrar deneyiniz.");
            } else if (iventory1.getMoney() > armorList[selectArmor - 1].getMoney()) {
                int oldBlock = armor1.getBlock();
                armor1 = armorList[selectArmor - 1];
                iventory1.setMoney(iventory1.getMoney() - armor1.getMoney());
                iventory1.setBlock(iventory1.getBlock() + armor1.getBlock() - oldBlock);

                System.out.println(armor1.getName() + " zırhını satın aldınız.");

            } else {
                System.out.println(" Paranız yeterli değil.");
            }

        }
    }

    public void gameOver() {
        int monstarTotal = 0;
        for (Monstar m : monstars) {
            monstarTotal += m.getTotal();

        }

        if (iventory1.getHealth() <= 0) {
            System.out.println("Canınız sıfırlandı. Oyun bitti. Kaybettiniz.");
            System.exit(0);
        } else if (monstarTotal <= 0) {
            System.out.println("Tüm canavarları yendiniz. Oyunu Kazandınız.");
            System.exit(0);
        } else {
            System.out.println("Sizin canınız: " + iventory1.getHealth());
            System.out.println("canavar sayısı: " + monstarTotal);
            System.out.println("Daha çok işiniz var. oyuna devam.");
        }

    }

    public void battle(int id) {
        System.out.println("----------------------------------------------------------");
        Random randomB = new Random();
        String swar = "";
        while (monstars[id].getTotal() > 0) {
            if (swar.equals("K")) {
                System.out.println(" Savaştan kaçtınız.... Safe House'ye gidip canınızı fulleyebilirsiniz. ");
                break;
            }
            while (true) {
                System.out.println("Sizin canınız : " + iventory1.getHealth() + ", Sizin hasarınız : "
                        + iventory1.getDemage() + ",  Canavarın canı : "
                        + monstars[id].getHealth() + ", Canavarın hasarı : " + monstars[id].getDemage()
                        + ",  Canavar sayısı : " + monstars[id].getTotal());
                System.out.println("<S>avaş, <K>aç");
                System.out.print("Lütfen bir seçim yapınız : ");
                String selectWar = input.next().toUpperCase();
                System.out.println("----------------------------------------------------------");
                if (selectWar.equals("K")) {
                    swar = selectWar;
                    break;
                }
                if (selectWar.equals("S")) {
                    if (randomB.nextInt(100) + 1 >= 50) {
                        System.out.println("Siz vurdunuz !");
                        monstars[id].setHealth(monstars[id].getHealth() - iventory1.getDemage());
                    } else {
                        System.out.println("Canavar vurdu !");
                        if (id == 3) {
                            monstars[id].setDemage((randomB.nextInt(4)) + 3);
                        }
                        iventory1.setHealth(iventory1.getHealth() + iventory1.getBlock() - monstars[id].getDemage());
                    }

                }

                if (monstars[id].getHealth() <= 0) {
                    int randomx = (randomB.nextInt(100)) + 1;
                    int randomy = (randomB.nextInt(100)) + 1;
                    if (randomx < 45) {
                        System.out.println("Hiçbirşey kazanamadınız.");
                    }
                    if (randomx >= 45 && randomx < 70) {
                        if (randomy < 50) {
                            System.out.println("1 Para kazandınız.");
                            iventory1.setMoney(iventory1.getMoney() + 1);
                        }
                        if (randomy >= 50 && randomy < 80) {
                            System.out.println("5 Para kazandınız.");
                            iventory1.setMoney(iventory1.getMoney() + 5);
                        }
                        if (randomy >= 80 && randomy <= 100) {
                            System.out.println("10 Para kazandınız.");
                            iventory1.setMoney(iventory1.getMoney() + 10);
                        }
                    }
                    if (randomx >= 70 && randomx < 85) {
                        if (randomy < 50) {
                            System.out.println("Hafif Zırh kazandınız.");
                            iventory1.setLightArmor(iventory1.getLightArmor() + 1);
                        }
                        if (randomy >= 50 && randomy < 80) {
                            System.out.println("Orta Zırh kazandınız.");
                            iventory1.setMidleArmor(iventory1.getMidleArmor() + 1);
                        }
                        if (randomy >= 80 && randomy <= 100) {
                            System.out.println("Ağır Zırh kazandınız.");
                            iventory1.setHardArmor(iventory1.getHardArmor() + 1);
                        }
                    }
                    if (randomx >= 85 && randomx <= 100) {
                        if (randomy < 50) {
                            System.out.println("Tabanca kazandınız.");
                            iventory1.setGun(iventory1.getGun() + 1);
                        }
                        if (randomy >= 50 && randomy < 80) {
                            System.out.println("Kılıç kazandınız.");
                            iventory1.setSword(iventory1.getSword() + 1);
                        }
                        if (randomy >= 80 && randomy <= 100) {
                            System.out.println("Tüfek kazandınız.");
                            iventory1.setRifle(iventory1.getRifle() + 1);
                        }
                    }

                    monstars[id].setTotal(monstars[id].getTotal() - 1);
                    if (monstars[id].getTotal() > 0) {
                        monstars[id].setHealth(monstars[id].getOhealth());

                    } else {

                        if (id == 3) {
                            iventory1.setFood(iventory1.getFood() + location1.getAward());
                            System.out.println(location1.getName() + " de " + monstars[id].getName() + " kalmadı."
                                    + location1.getAwardName() + " kazandınız.");
                        } else if (id == 4) {
                            iventory1.setFirewood(iventory1.getFirewood() + location1.getAward());
                            System.out.println(location1.getName() + " de " + monstars[id].getName() + " kalmadı."
                                    + location1.getAwardName() + " kazandınız.");
                        } else if (id == 5) {
                            iventory1.setWater(iventory1.getWater() + location1.getAward());
                            System.out.println(location1.getName() + " de " + monstars[id].getName() + " kalmadı."
                                    + location1.getAwardName() + " kazandınız.");
                        } else if (id == 6) {
                            String[] esya = { "Para", "Silah", "Zırh" };
                            int esyaN = (randomB.nextInt(3));
                            System.out.println(esya[esyaN] + " kazandınız.");
                        }

                        break;
                    }

                }

            }

        }

    }

    public void show(int id) {

        System.out.println("----------------------------------------------------------");

        System.out.println("Player   : " + iventory1.getPlayerName());
        System.out.println("Karakter : " + iventory1.getCharName()
                + "\tDemage : " + iventory1.getDemage() + "\t\tHealt : "
                + iventory1.getHealth() + "\t\tMoney : " + iventory1.getMoney() + "\t\tBlock :" + iventory1.getBlock());

        System.out.println("Location : " + location1.getName());
        System.out.println("Weapon   : " + weapon1.getName() + "\t\tZırh: " + armor1.getName());
        System.out.println("Monstar  : " + monstars[id].getName()
                + "\tDemage : " + monstars[id].getDemage() + "\t\tHealt : "
                + monstars[id].getHealth() + "\t\tMoney : " + monstars[id].getMoney() + "\t\tTotal : "
                + monstars[id].getTotal());
        System.out.println("----------------------------------------------------------");

    }

    public int getTotalDemage() {
        return totalDemage;
    }

    public void setTotalDemage(int totalDemage) {
        this.totalDemage = totalDemage;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getTotalMonstar() {
        return totalMonstar;
    }

    public void setTotalMonstar(int totalMonstar) {
        this.totalMonstar = totalMonstar;
    }

    public boolean isMonstar() {
        return isMonstar;
    }

    public void setMonstar(boolean isMonstar) {
        this.isMonstar = isMonstar;
    }

    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Game.input = input;
    }

    public Monstar[] getMonstars() {
        return monstars;
    }

    public void setMonstars(Monstar[] monstars) {
        this.monstars = monstars;
    }

    public Location getLocation1() {
        return location1;
    }

    public void setLocation1(Location location1) {
        this.location1 = location1;
    }

    public Weapons getWeapon1() {
        return weapon1;
    }

    public void setWeapon1(Weapons weapon1) {
        this.weapon1 = weapon1;
    }

    public Armors getArmor1() {
        return armor1;
    }

    public void setArmor1(Armors armor1) {
        this.armor1 = armor1;
    }

    public Iventory getIventory1() {
        return iventory1;
    }

    public void setIventory1(Iventory iventory1) {
        this.iventory1 = iventory1;
    }

}
