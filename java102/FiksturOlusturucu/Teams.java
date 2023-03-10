package java102.FiksturOlusturucu;

public class Teams implements Comparable<Teams>{

    private String teamName;

    public Teams(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public int compareTo(Teams o) {
        // TODO Auto-generated method stub
        return 0;
    }

}