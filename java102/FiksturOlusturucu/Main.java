package java102.FiksturOlusturucu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teams> team = new ArrayList<>();
        ArrayList<Integer> match = new ArrayList<>();
        ArrayList<Integer> matchset = new ArrayList<>();
        Random rnd = new Random();

        team.add(new Teams("Sivas"));
        team.add(new Teams("Galatasaray"));
        team.add(new Teams("Bursa"));
        team.add(new Teams("Fenerbahçe"));
        team.add(new Teams("Beşiktaş"));
        team.add(new Teams("Başakşehir"));
        team.add(new Teams("Trabzon"));

        if (team.size() % 2 == 1) {
            team.add(new Teams("Bay"));
        }

        while (team.size() > match.size()) {

            int a = 1 + rnd.nextInt(team.size());
            System.out.print(a + " ");
            if (!match.contains(a))
                match.add(a);
        }

        System.out.println(match);

        for (int j = 0; j < team.size() - 1; j++) {

            for (int i = 0; i < team.size() / 2; i++) {

                matchset.add(match.get(i));
                matchset.add(match.get(team.size() - i - 1));
            }
            int temp = match.get(1);
            match.remove(1);
            match.add(temp);
        }
        System.out.println(matchset);

        System.out.println(".................. Takımlar .............");
        for (Teams t : team) {
            if (t.getTeamName() != "Bay") {
                System.out.println("- " + t.getTeamName());
            }
        }

        System.out.println();

        for (int sezon = 1; sezon < 3; sezon++) {

            System.out.println(sezon + ". Dönem Fikstür ----------");

            for (int i = 0; i < matchset.size(); i = i + 2) {
                int hafta = (i / (team.size()) + 1 + (sezon - 1) * (team.size() - 1));
                if (i % (team.size()) == 0) {
                    System.out.println();
                    System.out.println(hafta + ". Hafta .........");

                }
                if (hafta % 2 == sezon%2 ) {
                    System.out.println(team.get(matchset.get(i) - 1).getTeamName() + " - "
                            + team.get(matchset.get(i + 1) - 1).getTeamName());
                } else {
                    System.out.println(team.get(matchset.get(i + 1) - 1).getTeamName() + " - "
                            + team.get(matchset.get(i) - 1).getTeamName());
                }

            }
        }
        

        

    }

}
