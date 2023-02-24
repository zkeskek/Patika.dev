package Monstar;


public class Monstar {
    private String name;
    private int id;
    private int demage;
    private int health;
    private int ohealth;
    private int money;
    private int total;

    public Monstar(String name, int id, int demage, int health, int money, int total,int ohealth) {
        this.name = name;
        this.id = id;
        this.demage = demage;
        this.health = health;
        this.money = money;
        this.total = total;
        this.ohealth=ohealth;
    }

    public Monstar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOhealth() {
        return ohealth;
    }

    public void setOhealth(int ohealth) {
        this.ohealth = ohealth;
    }

}
