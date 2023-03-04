package Location;

public class Location {
    private int id;
    private String name;
    private int award;
    private String awardName;

    public Location() {
       
    }
    public Location(int id, String name, int award,String awardName) {
        this.id = id;
        this.name = name;
        this.award=award;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAward() {
        return award;
    }
    public void setAward(int award) {
        this.award = award;
    }
    public String getAwardName() {
        return awardName;
    }
    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    
}
