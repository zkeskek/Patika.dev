package Tools;

public class Weapons {
    private int id;
    private String name;
    private int demage;
    private int money;

    public Weapons(){

    }
    public Weapons(int id, String name, int demage, int money) {
        this.id = id;
        this.name=name;
        this.demage = demage;
        this.money = money;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
