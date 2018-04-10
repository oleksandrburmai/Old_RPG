import model.team.Team;
import util.output.OutPutData;

public class Game {
    public void startGame() {
        Team team = new Team();
        OutPutData.printDatumInfo();
        OutPutData.printRaceInfo();
        team.createTeam();
        for (int i = 0; i < 3; i++) {
            OutPutData.printHeroInfo(team, i);
        }
    }
}
