
import model.team.Team;


public class App {
    public static void main(String[] args) {
        Team team = new Team();
        team.createTeam();
        for (int i = 0; i < 3; i++) {
            System.out.println(team.getHeroes()[i].getHeroName() + " " + team.getHeroes()[i].getProfessionName());
        }

    }
}
