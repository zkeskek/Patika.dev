import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjinalHealt;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] charList = { new Samurai(), new Archer(), new Knight() };
        System.out.println("KARAKTERLER");
        System.out.println("-----------------------------");

        for (GameChar gameChar : charList) {
            System.out.println("ID : " + gameChar.getId() +
                    "\t  Karakter : " + gameChar.getName() +
                    "\t\t  Hasar : " + gameChar.getDamage() +
                    "\t\t  Sağlık : " + gameChar.getHealth() +
                    "\t\t  Para : " + gameChar.getMoney());
        }
        System.out.println("-----------------------------");
        System.out.print("Lütfen bir karakter giriniz : ");
        int selectChar = input.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;

            case 2:
                initPlayer(new Archer());
                break;

            case 3:
                initPlayer(new Knight());
                break;
            default:
                break;
        }

        /*
         * System.out.println("Karakter : " + getCharName() +
         * "\t\t  Hasar : " + getDamage() +
         * "\t\t  Sağlık : " + getHealth() +
         * "\t\t  Para : " + getMoney());
         */
    }

    public void printInfo() {
        System.out.println("Silah : " + getInventory().getWeapon().getName() +
                "\t Zırh : " + getInventory().getArmor().getName() +
                "\t Bloklama : " + getInventory().getArmor().getBlock() +
                "\t  Hasar : " + getTotalDemage() +
                "\t  Sağlık : " + getHealth() +
                "\t  Para : " + getMoney());
    }

    public void initPlayer(GameChar gameChar) {
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }
    public int getTotalDemage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage ;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjinalHealt() {
        return orjinalHealt;
    }

    public void setOrjinalHealt(int orjinalHealt) {
        this.orjinalHealt = orjinalHealt;
    }

}
