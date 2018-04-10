
import model.team.Team;
import util.output.OutPutData;


public class App {
    public static void main(String[] args) {
        Team team = new Team();
        team.createTeam();
        for (int i = 0; i < 3; i++) {
            OutPutData.printHeroInfo(team, i);
        }

    }
}
