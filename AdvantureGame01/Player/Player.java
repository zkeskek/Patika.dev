package Player;
public class Player {
    private String name;
    private String charName;
    private int id;
    private int demage;
    private int health;
    private int money;
    
    public Player() {
        
    }
    
    public Player(String charName, int id, int demage, int health, int money) {
        
        this.charName = charName;
        this.id = id;
        this.demage = demage;
        this.health = health;
        this.money = money;
    }

    
    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
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
    
     

}
