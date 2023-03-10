package java102.FiksturOlusturucu;

public class Fikstur implements Comparable<Teams> {

    public int team1;
    public int team2;

    public Fikstur(int team1, int team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public int getTeam1() {
        return team1;
    }

    public void setTeam1(int team1) {
        this.team1 = team1;
    }

    public int getTeam2() {
        return team2;
    }

    public void setTeam2(int team2) {
        this.team2 = team2;
    }

    @Override
    public int compareTo(Teams o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
